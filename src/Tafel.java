
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class Tafel {

    int ronde;
    int tafelnummer;
    ArrayList<ToernooiInschrijving> spelers = new ArrayList();
    Toernooi toernooi;

    public Tafel(Toernooi toernooi, int tafelnummer, int ronde) {
        this.toernooi = toernooi;
        this.tafelnummer = tafelnummer;
        this.ronde = ronde;
        if (existsInDB()) {
            getIndelingFromDB();
        }
    }

    public void addInschrijving(ToernooiInschrijving inschrijving) {
        spelers.add(inschrijving);
    }

    private void getIndelingFromDB() {
        String query = "SELECT speler FROM speler_inschrijving WHERE tafel_nr = ? AND ronde_nr = ? and toernooi = ?";
        try {
            PreparedStatement stat = FullHouseDatabase.getConnection().prepareStatement(query);
            stat.setInt(1, tafelnummer);
            stat.setInt(2, ronde);
            stat.setInt(3, toernooi.getEventNr());
            ResultSet result = stat.executeQuery();
            while (result.next()) {
                spelers.add(new ToernooiInschrijving(result.getInt("speler"), toernooi.getEventNr()));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void writeToDB() {
        Connection conn;
        PreparedStatement stat;
        String insertTafel = "INSERT INTO tafel_indeling VALUES(?,?,?)";
        try {
            if (!existsInDB()) {
                conn = FullHouseDatabase.getConnection();
                stat = conn.prepareStatement(insertTafel);
                stat.setInt(1, tafelnummer);
                stat.setInt(2, ronde);
                stat.setInt(3, toernooi.getEventNr());
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        if (existsInDB()) {
            for (ToernooiInschrijving inschrijving : spelers) {
                writeIndelingToDB(inschrijving);
            }
        }
    }

    private void writeIndelingToDB(ToernooiInschrijving inschrijving) {
        if (!indelingExistsInDB(inschrijving.getSpeler())) {
            try {
                String insert = "INSERT INTO speler_indeling VALUES (?,?,?,?)";
                PreparedStatement stat = FullHouseDatabase.getConnection().prepareStatement(insert);
                stat.setInt(1, tafelnummer);
                stat.setInt(2, ronde);
                stat.setInt(3, toernooi.getEventNr());
                stat.setInt(4, inschrijving.getSpeler().getPNR());
                stat.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }

    public final boolean existsInDB() {
        String query = " SELECT EXISTS(SELECT * FROM tafel_indeling WHERE tafel_nr = " + tafelnummer + " AND ronde_nr =" + ronde + " AND toernooi = " + toernooi.getEventNr() + ")AS exist;";
        try {
            Connection conn = FullHouseDatabase.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery(query);
            result.next();
            return result.getInt("exist") == 1;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }

    }

    private boolean indelingExistsInDB(Speler speler) {
        String query = " SELECT EXISTS(SELECT * FROM speler_indeling WHERE tafel_nr = " + tafelnummer + " AND ronde_nr =" + ronde + " AND toernooi = " + toernooi.getEventNr() + " AND speler = " + speler.getPNR() + "AS exist;";
        try {
            Connection conn = FullHouseDatabase.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery(query);
            result.next();
            return result.getInt("exist") == 1;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
}
