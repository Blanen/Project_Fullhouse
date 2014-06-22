
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
    private Random randomGenerator = new Random();
    private ArrayList<Tafel> tafels = new ArrayList();
    private ArrayList<ToernooiInschrijving> inschrijvingen = new ArrayList();

    public Toernooi(String plaats, Date datum, String tijd, double inschrijfGeld, int max_inschrijvingen, int tafelGrootte) {
        super(plaats, datum, tijd, inschrijfGeld, max_inschrijvingen);
        this.tafelGrootte = tafelGrootte;
    }

    public Toernooi(int toernooi_nr) {
        super(toernooi_nr);
        String query = "SELECT * FROM toernooi WHERE toernooi_nr = " + toernooi_nr + ";";
        
        try {
            Connection conn = FullHouseDatabase.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery(query);
            result.next();
            tafelGrootte = result.getInt("tafelgrootte");
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
        int aantalSpelers = inschrijvingen.size();
        int minAantalTafels = (int) Math.ceil((double)aantalSpelers / (double)tafelGrootte);
        int aantalRondes = 0;
        double tafelAmount = minAantalTafels;
        if(tafelAmount == 1) {
            aantalRondes++;
        }
        while(tafelAmount > 1){
            tafelAmount = tafelAmount/tafelGrootte;
            aantalRondes++;
        }
        
        for(int i = 1; i<=aantalRondes; i++){
            for(int x = 0; x < Math.pow(tafelGrootte, aantalRondes - i); x++){
                tafels.add(new Tafel(this, x, i));
            }
        }
        
    }
    
    public void maakIndeling(){
        ArrayList<ToernooiInschrijving> inschrijvingen = this.inschrijvingen;
        try {
            String query = "SELECT MAX(ronde_nr) FROM tafel_indeling WHERE toernooi = " + this.getEvent_nr();;
            ResultSet result = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            result.next();
            huidigeRonde = 1 + result.getInt("MAX(ronde_nr)");
        } catch (SQLException e) {
            System.out.println(e);
        }
        
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
     * @return the huidigeRonde
     */
    public int getHuidigeRonde() {
        String query = "SELECT MAX(ronde_nr) FROM tafel_indeling WHERE toernooi = " + this.getEventNr();
        try {
            ResultSet result = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            result.next();
            huidigeRonde = result.getInt("MAX(ronde_nr)");
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return huidigeRonde;
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
        ArrayList<Tafel> huidigeRondeTafels = new ArrayList();
        try {
            String query = "SELECT MAX(ronde_nr), tafel_nr FROM tafel_indeling"
                            + " WHERE toernooi = " + this.getEvent_nr();
            ResultSet result = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            while (result.next()) {
                huidigeRondeTafels.add(new Tafel(this, result.getInt("tafel_nr"), result.getInt("MAX(ronde_nr)")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return huidigeRondeTafels;
    }

    /**
     * @return the inschrijvingen
     */
    public ArrayList<ToernooiInschrijving> getInschrijvingen() {
        return inschrijvingen;
    }
    
    public void setWinnaars (Speler eerste, Speler tweede, Speler derde) {
        String update = "UPDATE toernooi SET eerste_plaats = " + eerste.getPNR() + ", tweede_plaats = " + tweede.getPNR() + ", derde_plaats = " + derde.getPNR();
        try {
            FullHouseDatabase.getConnection().createStatement().executeUpdate(update);
        } catch (SQLException e) {
            System.out.println(e);
        }
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
    
}
