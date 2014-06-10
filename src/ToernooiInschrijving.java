
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
public class ToernooiInschrijving {

    private int speler;
    private int toernooi;
    private boolean isBetaald;

    public ToernooiInschrijving(int speler, int Toernooi, boolean isBetaald) {
        this.speler = speler;
        this.toernooi = toernooi;
        this.isBetaald = isBetaald;
    }
    
    public static ArrayList<ToernooiInschrijving> getToernooiInschrijvingBySpeler(Speler speler){
        ArrayList <ToernooiInschrijving> inschrijvingen = new ArrayList();
        String query = "SELECT * FROM ToernooiInschrijving WHERE speler = " + speler.getPNR() + ";";
        try{
            ResultSet result = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            while(result.next()){
                inschrijvingen.add(new ToernooiInschrijving(speler.getPNR(),result.getInt("toernooi"), result.getBoolean("isBetaald")));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return inschrijvingen;
    }
    
    public static ArrayList<ToernooiInschrijving> getToernooiInschrijvingByToernooi(Toernooi toernooi){
        ArrayList <ToernooiInschrijving> inschrijvingen = new ArrayList();
        String query = "SELECT * FROM ToernooiInschrijving WHERE speler = " + toernooi.getEventNr() + ";";
        try{
            ResultSet result = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            while(result.next()){
                inschrijvingen.add(new ToernooiInschrijving(result.getInt("speler"), toernooi.getEventNr(), result.getBoolean("isBetaald")));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return inschrijvingen;
    }
    
    public int getSpeler(){
        return speler;
    }
    
    public Toernooi getToernooi(){
        return new Toernooi(toernooi);
    }
    
    public boolean isBetaald(){
        return isBetaald;
    }
}

