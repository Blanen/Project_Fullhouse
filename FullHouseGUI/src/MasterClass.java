
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

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

    private int min_rating;
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
            Connection conn = null;
            Statement stat = conn.createStatement();
            result = stat.executeQuery(query);
            result.next();
            min_rating = result.getInt("min_rating");
            docent = new Docent(result.getInt("docent"));
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    @Override
    public boolean existsInDB() {
        String query = "SELECT EXISTS(masterclass_nr) AS exists FROM masterclass WHERE masterclass_nr = " + getEventNr() + ";";
        Connection conn = null;
        try {
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery(query);
            result.next();
            return result.getBoolean("exists");
        } catch (SQLException e) {
            System.out.println(e);
            return false;

        }
    }

    @Override
    public void writeToDB() {
        super.writeToDB();
        String update = "UPDATE masterclass SET docent = min_rating = " + min_rating + ", " + docent.getID() + " WHERE masterclass_nr = " + getEventNr() + ";";
        String write = "INSERT INTO masterclass VALUES(" + getEventNr() + ", " + min_rating + ", " + docent.getID() + ");";
        Connection conn = null;
        Statement stat;
        try {
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
}
