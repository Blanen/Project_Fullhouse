
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Regi
 */
public class MasterClassInschrijving extends Inschrijving {

    private int masterClass;

    public MasterClassInschrijving(int speler, int masterClass, boolean isBetaald) {
        super(speler, isBetaald);
        this.masterClass =  masterClass;
    }

    public static ArrayList<MasterClassInschrijving> getMasterClassInschrijvingBySpeler(Speler speler) {
        ArrayList<MasterClassInschrijving> inschrijvingen = new ArrayList();
        String query = "SELECT * FROM MasterClass_Inschrijving WHERE speler = " + speler.getPNR() + ";";
        try {
            ResultSet result = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            while (result.next()) {
                inschrijvingen.add(new MasterClassInschrijving(speler.getPNR(), result.getInt("masterclass"), result.getBoolean("isBetaald")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return inschrijvingen;
    }

    public static ArrayList<MasterClassInschrijving> getMasterClassInschrijvingByMasterClass(MasterClass masterClass) {
        ArrayList<MasterClassInschrijving> inschrijvingen = new ArrayList();
        String query = "SELECT * FROM masterclass_inschrijving WHERE speler = " + masterClass.getEventNr() + ";";
        try {
            ResultSet result = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            while (result.next()) {
                inschrijvingen.add(new MasterClassInschrijving(result.getInt("speler"), masterClass.getEventNr(), result.getBoolean("isBetaald")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return inschrijvingen;
    }

    public MasterClass getMasterClass(){
        return new MasterClass(masterClass);
    }
    
    @Override
    public MasterClass getEvent(){
        return getMasterClass();
    }
    
    
    public void writeToDB(){
        String insert = "INSERT INTO masterclass_inschrijving ("+masterClass+","+getSpelerID()+","+isBetaald()+");";
        String update = "UPDATE Toernooi_Inschrijving SET is_betaald = "+isBetaald()+"WHERE masterclass = "+masterClass+" AND speler = "+-getSpelerID()+";";
        try{
            if(existsInDB()){
                FullHouseDatabase.getConnection().createStatement().executeUpdate(update);
            }else{
                FullHouseDatabase.getConnection().createStatement().executeUpdate(insert);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public boolean existsInDB(){
          try{
            String query = " SELECT EXISTS(SELECT masterclass FROM masterclass_inschrijving WHERE speler = "+getSpelerID()+" AND masterclass = "+masterClass+")AS exist;";
            ResultSet rs = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            rs.next();
            return rs.getBoolean("exist");
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
}
