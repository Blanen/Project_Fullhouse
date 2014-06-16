
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Speler extends Persoon {

    private double rating;
    private double gewonnen_geld;

    public Speler() {

    }

    public Speler(int speler_nr) {
        super(speler_nr);
        try {
            Connection conn = FullHouseDatabase.getConnection();
            Statement stat = conn.createStatement();
            String query = "SELECT * FROM speler where speler_nr =" + speler_nr + ";";
            ResultSet rs = stat.executeQuery(query);
            rs.next();
            this.rating = rs.getInt("rating");
            this.gewonnen_geld = rs.getInt("gewonnen_geld");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public String[] geefKolomNamen() {
        String[] kolomnamen = {"spelernummer",
            "rating",
            "voornaam",
            "tussenvoegsel",
            "achternaam",
            "straat",
            "huisnummer",
            "woonplaats",
            "postcode",
            "emailadres",
            "mobielnummer",
            "vast nummer",
            "gewonnen_geld"
        };

        return kolomnamen;

    }

    public void setRating(double r) {
        this.rating = r;
    }

    public void setGewonnenGeld(double gg) {
        this.gewonnen_geld = gg;
    }

    @Override
    public boolean existsInDB() {
        try {
            String query = " SELECT EXISTS(SELECT speler_nr FROM speler WHERE speler_nr = " + getPNR() + ")AS exist;";
            ResultSet rs = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            rs.next();
            return rs.getBoolean("exist");
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }

    }

    @Override
    public boolean writeToDB() {
        if (super.writeToDB()) {
            String insert = "INSERT INTO speler (rating, gewonnen_geld, speler_nr) VALUES(?, ?, ?)";
            String update = "UPDATE speler SET rating = ?, gewonnen_geld = ? WHERE speler_nr = ?";
            String query;
            if (existsInDB()) {
                query = update;
            } else {
                query = insert;
            }
            try {
                PreparedStatement stat = FullHouseDatabase.getConnection().prepareStatement(query);
                stat.setDouble(1, rating);
                stat.setDouble(2, gewonnen_geld);
                stat.setInt(3, getPNR());
                stat.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e);
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    public double getRating() {
        return rating;
    }

    public double getGeld() {
        return gewonnen_geld;
    }

    /*public void schrijfIn(Event event){
        if(event instanceof Toernooi){
            if(kanInschrijven((Toernooi) event)){
                //event.schrijfSpelerIn(this);
            }
        }else{
            //event.schrijfSpelerIn(this);
        }
    }
    */
    
    public boolean kanInschrijven(Toernooi toernooi){
        String query = "Select datum FROM event WHERE event_nr IN(SELECT toernooi FROM toernooi_inschrijving WHERE speler = "+getPNR()+")";
        ResultSet result;
        ArrayList <Date> data = new ArrayList();
        long checkTime = toernooi.getDatum().getTime();
        final long dayTime = 86400;
        try{
            result = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            while(result.next()){
                data.add(result.getDate("datum"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        for(Date date : data){
          long preTime = date.getTime()-dayTime;
          long postTime = date.getTime()+dayTime;
          if(checkTime < postTime && checkTime > preTime){
              return false;
          }   
        }
        return true;
    }
}
