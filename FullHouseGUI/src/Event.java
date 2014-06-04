
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
public abstract class Event {

    private String plaats;
    private Date datum;
    private String tijd;
    private double inschrijfGeld;
    private int event_nr;
    private boolean existsInDB;

    public Event(String plaats, Date datum, String tijd, double inschrijfGeld) {
        this.plaats = plaats;
        this.datum = datum;
        this.tijd = tijd;
        this.inschrijfGeld = inschrijfGeld;
    }

    public Event(int event_nr) {
        this.event_nr = event_nr;
        Connection conn = null;
        Statement stat = null;
        String query = "SELECT * FROM event WHERE event_nr = " + event_nr + ";";
        try {
            ResultSet result = stat.executeQuery(query);
            result.next();
            this.plaats = result.getString("plaats");
            this.datum = result.getDate("datum");
            this.tijd = result.getString("tijd");
            this.inschrijfGeld = result.getDouble("inschrijfgeld");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public abstract boolean existsInDB();
    
    public void writeToDB(){
        String update = "UPDATE event SET plaats = "+plaats+", datum = "+datum+", tijd = "+tijd+", inschrijfgeld = "+inschrijfGeld+" WHERE event_nr = "+event_nr+";";
        String write = "INSERT INTO event VALUES("+getEventNr()+", "+ plaats +", "+ datum +", "+tijd+", "+inschrijfGeld+");";
        Connection conn = null;
        Statement stat;
        try{
            stat = conn.createStatement();
            if(existsInDB()){
                stat.executeUpdate(update);
            }else{
                stat.executeUpdate(write);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public int getEventNr(){
        return event_nr;
    }
}
