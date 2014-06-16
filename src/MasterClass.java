
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class MasterClass extends Event {

    private double min_rating;
    private Docent docent;

    public MasterClass(String plaats, Date datum, String tijd, double inschrijfGeld, int max_inschrijvingen, int min_rating, Docent docent) {
        super(plaats, datum, tijd, inschrijfGeld, max_inschrijvingen);
        this.docent = docent;
        this.min_rating = min_rating;
    }

    public MasterClass(int masterclass_nr) {
        super(masterclass_nr);
        String query = "SELECT * FROM masterclass WHERE masterclass_nr =" + masterclass_nr + ";";
        ResultSet result;
        try {
            Connection conn = FullHouseDatabase.getConnection();
            Statement stat = conn.createStatement();
            result = stat.executeQuery(query);
            result.next();
            min_rating = result.getDouble("min_rating");
            docent = new Docent(result.getInt("docent"));
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    @Override
    public boolean existsInDB() {
        String query = " SELECT EXISTS(SELECT masterclass_nr FROM masterclass WHERE masterclass_nr = "+getEventNr()+")AS exist;";
        try {
            Connection conn = FullHouseDatabase.getConnection();
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery(query);
            result.next();
            return result.getBoolean("exist");
        } catch (SQLException e) {
            System.out.println(e);
            return false;

        }
    }

    @Override
    public void writeToDB() {
        super.writeToDB();
        String update = "UPDATE masterclass SET min_rating = " + min_rating + ", docent = " + getDocent().getPNR()+ " WHERE masterclass_nr = " + getEventNr() + ";";
        String write = "INSERT INTO masterclass VALUES(" + getEventNr() + ", " + min_rating + ", " + getDocent().getPNR() + ");";
        
        try {
            Connection conn = FullHouseDatabase.getConnection();
            Statement stat = conn.createStatement();
            if (existsInDB()) {
                stat.executeUpdate(update);
            } else {
                stat.executeUpdate(write);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void setMinRating(double minRating){
        min_rating = minRating;
    }
    
     public double getMinRating(){
        return min_rating;
    }

    /**
     * @return the docent
     */
    public Docent getDocent() {
        return docent;
    }

    /**
     * @param docent the docent to set
     */
    public void setDocent(Docent docent) {
        this.docent = docent;
    }
    
    public boolean isVol(){
        try{
            String query = "SELECT count(masterclass) FROM masterclass_inschrijving WHERE masterclass = "+getEventNr()+";";
            ResultSet res = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            res.next();
            return res.getInt("count(masterclass)") >= getMax_inschrijvingen();
        }catch(SQLException e){
            System.out.println(e);
            return true;
        }
    }
}
