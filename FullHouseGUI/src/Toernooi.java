
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Regi
 */
public class Toernooi extends Event {

    private int tafelGrootte;
    private int rondes;
    private ArrayList<Tafel> tafels = new ArrayList();
    private ArrayList<ToernooiInschrijving> inschrijvingen = new ArrayList();

    public Toernooi(String plaats, Date datum, String tijd, double inschrijfGeld, int max_inschrijvingen, int tafelGrootte, int rondes) {
        super(plaats, datum, tijd, inschrijfGeld, max_inschrijvingen);
        this.tafelGrootte = tafelGrootte;
        this.rondes = rondes;
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
            rondes = result.getInt("rondes");
        } catch (SQLException e) {
            System.out.println(e);
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
        
        String update = "UPDATE toernooi set tafelGrootte = " + getTafelGrootte() + ", rondes = " + getRondes() + " WHERE toernooi_nr = " + getEventNr() + ";";
        String write = "INSERT INTO toernooi VALUES(" + getEventNr() + ", " + getTafelGrootte() + ", " + getRondes() + ", null, null, null);";
        
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
     * @return the rondes
     */
    public int getRondes() {
        return rondes;
    }

    /**
     * @param rondes the rondes to set
     */
    public void setRondes(int rondes) {
        this.rondes = rondes;
    }

    /**
     * @return the tafels
     */
    public ArrayList<Tafel> getTafels() {
        return tafels;
    }

    /**
     * @return the inschrijvingen
     */
    public ArrayList<ToernooiInschrijving> getInschrijvingen() {
        return inschrijvingen;
    }

}