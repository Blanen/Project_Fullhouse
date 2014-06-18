
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
$ */
/**
 *
 * @author Regi
 */
public class Toernooi extends Event {

    private int tafelGrootte;
    private int huidigeRonde;
    private int aantalInschrijvingen;
    private Random randomGenerator = new Random();
    private ArrayList<Tafel> tafels = new ArrayList();
    private ArrayList<ToernooiInschrijving> inschrijvingen = new ArrayList();

    public Toernooi(String plaats, Date datum, String tijd, double inschrijfGeld, int max_inschrijvingen, int tafelGrootte) {
        super(plaats, datum, tijd, inschrijfGeld, max_inschrijvingen);
        this.tafelGrootte = tafelGrootte;
        this.aantalInschrijvingen = 0;
    }

    public Toernooi(int toernooi_nr) {
        super(toernooi_nr);
        String query = "SELECT toernooi.tafelgrootte, COUNT(toernooi) FROM toernooi INNER JOIN toernooi_inschrijving ON toernooi_nr = toernooi WHERE toernooi_nr = " + toernooi_nr + ";";
        
        try {
            Connection conn = FullHouseDatabase.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery(query);
            result.next();
            tafelGrootte = result.getInt("toernooi.tafelgrootte");
            aantalInschrijvingen = result.getInt("count(toernooi)");
        } catch (SQLException e) {
            System.out.println(e);
        }
        initInschrijvingen();
    }
    
    public void eersteIndeling(){
        initInschrijvingen();
        maakTafels();
        maakIndeling();
    }
    
    public void maakTafels(){
        ArrayList<Tafel> tafels = new ArrayList();
        int aantalSpelers = inschrijvingen.size();
        int minAantalTafels = aantalSpelers/tafelGrootte;
        int aantalRondes = 0;
        double tafelAmount = minAantalTafels;
        while(tafelAmount > 1){
            tafelAmount = tafelAmount/tafelGrootte;
            aantalRondes++;
        }
        for(int i = 1; i<=aantalRondes; i++){
            for(int x = 0; x < Math.pow(tafelGrootte, aantalRondes - i); x++){
                tafels.add(new Tafel(this, x, i));
            }
        }
        for(Tafel tafel : tafels){
            tafel.writeToDB();
        }
    }
    
    public void maakIndeling(){
        ArrayList<ToernooiInschrijving> inschrijvingen = this.inschrijvingen;
        /*try {
            String query = "SELECT MAX(rondenummer) FROM tafel_indeling WHERE toernooi = toernooi.getEvent_nr;";
            ResultSet result = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            result.next();
            huidigeRonde = 1 + result.getInt("rondenummer");
        } catch (SQLException e) {
            System.out.println(e);
        }*/
        
	while(inschrijvingen.size()>0){
		for(Tafel tafel : tafels){
			ToernooiInschrijving speler = inschrijvingen.get(randomGenerator.nextInt(inschrijvingen.size()));
			tafel.addInschrijving(speler);
			inschrijvingen.remove(speler);
		}
	}

	for(Tafel tafel : tafels){
		tafel.writeToDB();
	}
}

    public void spelerToNextRound(ToernooiInschrijving speler, Tafel tafel){
        int huidigeRonde = tafel.getRonde()+1;
        ArrayList <Tafel> tafels = new ArrayList();
        String query = "SELECT tafel_nr FROM tafel_indeling WHERE toernooi = "+getEventNr()+" AND ronde_nr = "+huidigeRonde+";";
        try{
            ResultSet rs = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            while(rs.next()){
                Tafel tfl = new Tafel(this, rs.getInt("tafel_nr"), huidigeRonde);
                if(!tfl.zitVol()){
                    tafels.add(tfl);
                }
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        tafels.get(randomGenerator.nextInt(tafels.size())).addInschrijving(speler);
    }
    
    public void inschrijvingAdded(){
        aantalInschrijvingen++;
    }
    
    @Override
    public boolean isVol(){
        try{
            String query = "SELECT count(toernooi) FROM toernooi_inschrijving WHERE toernooi = "+getEventNr()+";";
            ResultSet res = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            res.next();
            return res.getInt("count(toernooi)") >= getMax_inschrijvingen();
        }catch(SQLException e){
            System.out.println(e);
            return true;
        }
    }
    
    @Override
    public boolean existsInDB() {
        String query = " SELECT EXISTS(SELECT toernooi_nr FROM toernooi WHERE toernooi_nr = "+getEventNr()+")AS exist;";
        
        try {
            Connection conn = FullHouseDatabase.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery(query);
            result.next();
            return result.getInt("exist")==1;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    @Override
    public void writeToDB() {
        super.writeToDB();
        
        String update = "UPDATE toernooi set tafelGrootte = " + getTafelGrootte() + ", max_inschrijvingen = " + getMax_inschrijvingen()+ " WHERE toernooi_nr = " + getEventNr() + ";";
        String write = "INSERT INTO toernooi VALUES(" + getEventNr() + ", " + getTafelGrootte() + ", " + getMax_inschrijvingen()+ ", null, null, null);";
        
        Statement stat;
        try {
            Connection conn = FullHouseDatabase.getConnection();
            stat = conn.createStatement();
            if (existsInDB()) {
                stat.executeUpdate(update);
            } else {
                stat.executeUpdate(write);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * @return the tafelGrootte
     */
    public int getTafelGrootte() {
        return tafelGrootte;
    }

    /**
     * @param tafelGrootte the tafelGrootte to set
     */
    public void setTafelGrootte(int tafelGrootte) {
        this.tafelGrootte = tafelGrootte;
    }

    /**
     * @return the tafels
     */
    public ArrayList<Tafel> getHuidigeRondeTafels() {
        System.out.println("getHuidigeRondeTafels not yet implemented!");
        return null;
    }

    /**
     * @return the inschrijvingen
     */
    public ArrayList<ToernooiInschrijving> getInschrijvingen() {
        return inschrijvingen;
    }

    public void initInschrijvingen(){
        ArrayList <ToernooiInschrijving> inschr = new ArrayList();
        try{
            String query = "SELECT * FROM toernooi_inschrijving WHERE toernooi = "+getEventNr()+";";
            ResultSet res  = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            while(res.next()){
                inschr.add(new ToernooiInschrijving(res.getInt("speler"), getEventNr(), res.getBoolean("inschrijfstatus")));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        inschrijvingen = inschr;
    }
    
    @Override
    public String toString(){
        
        return super.toString() + " ("+aantalInschrijvingen+"/"+getMax_inschrijvingen()+")";
    }
}
