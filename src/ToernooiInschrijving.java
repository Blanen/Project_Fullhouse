
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
public class ToernooiInschrijving extends Inschrijving {

    private int toernooi;

    public ToernooiInschrijving(int speler, int toernooi, boolean isBetaald) {
        super(speler, isBetaald);
        this.toernooi = toernooi;
        
    }
    
    public static ArrayList<ToernooiInschrijving> getToernooiInschrijvingBySpeler(Speler speler){
        ArrayList <ToernooiInschrijving> inschrijvingen = new ArrayList();
        String query = "SELECT * FROM Toernooi_Inschrijving WHERE speler = " + speler.getPNR() + ";";
        try{
            ResultSet result = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            while(result.next()){
                inschrijvingen.add(new ToernooiInschrijving(speler.getPNR(),result.getInt("toernooi"), result.getBoolean("inschrijfstatus")));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return inschrijvingen;
    }
    
    public static ArrayList<ToernooiInschrijving> getToernooiInschrijvingByToernooi(Toernooi toernooi){
        ArrayList <ToernooiInschrijving> inschrijvingen = new ArrayList();
        String query = "SELECT * FROM Toernooi_Inschrijving WHERE speler = " + toernooi.getEventNr() + ";";
        try{
            ResultSet result = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            while(result.next()){
                inschrijvingen.add(new ToernooiInschrijving(result.getInt("speler"), toernooi.getEventNr(), result.getBoolean("inschrijfstatus")));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return inschrijvingen;
    }
    
    public Toernooi getToernooi(){
        return new Toernooi(toernooi);
    }
    
    @Override
    public Toernooi getEvent(){
        return getToernooi();
    }
    
    public void writeToDB(){
        String insert = "INSERT INTO toernooi_inschrijving ("+toernooi+","+getSpelerID()+","+isBetaald()+");";
        String update = "UPDATE Toernooi_Inschrijving SET inschrijfstatus = "+isBetaald()+" WHERE toernooi = "+toernooi+" AND speler = "+getSpelerID()+";";
        System.out.println(update);
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
            String query = " SELECT EXISTS(SELECT toernooi FROM toernooi_inschrijving WHERE speler = "+getSpelerID()+" AND toernooi = "+toernooi+")AS exist;";
            ResultSet rs = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            rs.next();
            return rs.getBoolean("exist");
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
}

