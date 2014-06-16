
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
public abstract class Event {

    private String plaats;
    private Date datum;
    private String tijd;
    private double inschrijfGeld;
    private int event_nr;
    private int max_inschrijvingen;
    private boolean existsInDB;

    public Event(String plaats, Date datum, String tijd, double inschrijfGeld, int max_inschrijvingen) {
        this.plaats = plaats;
        this.datum = datum;
        this.tijd = tijd;
        this.inschrijfGeld = inschrijfGeld;
        this.max_inschrijvingen = max_inschrijvingen;
    }

    public Event(int event_nr) {
        this.event_nr = event_nr;
        
        String query = "SELECT * FROM event WHERE event_nr = " + event_nr + ";";
        try {
            Statement stat = FullHouseDatabase.getConnection().createStatement();
            ResultSet result = stat.executeQuery(query);
            result.next();
            this.plaats = result.getString("plaats");
            this.datum = result.getDate("datum");
            this.tijd = result.getString("tijd");
            this.inschrijfGeld = result.getDouble("inschrijfgeld");
            this.max_inschrijvingen = result.getInt("max_inschrijvingen");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
   
    public abstract boolean existsInDB();

    public void writeToDB() {
        if(getEvent_nr() == 0){
            try{
                Statement stat = FullHouseDatabase.getConnection().createStatement();
                ResultSet result = stat.executeQuery("SELECT MAX(event_nr) AS nr FROM event");
                result.next();
                event_nr = result.getInt("nr")+1;
            }catch(SQLException e){
                
            }
        }
        
        String update = "UPDATE event SET plaats = '" + getPlaats() + "', datum = '" + getDatum().toString() + "', tijd = '" + getTijd() + "', inschrijfgeld = " + getInschrijfGeld() + ", max_inschrijvingen = "+getMax_inschrijvingen()+" WHERE event_nr = " + getEvent_nr() + ";";
        String write = "INSERT INTO event VALUES(" + getEventNr() + ", '" + getPlaats() + "', '" + getDatum().toString() + "', '" + getTijd() + "', " + getInschrijfGeld() +", "+getMax_inschrijvingen()+");";
        
        Statement stat;
        try {
            stat = FullHouseDatabase.getConnection().createStatement();
            if (existsInDB()) {
                stat.executeUpdate(update);
            } else {
                stat.executeUpdate(write);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public int getEventNr() {
        return getEvent_nr();
    }
    
    public abstract boolean isVol();    
   
    
    @Override
    public String toString(){
        
        return this.getClass().getSimpleName() + "  " + getDatum() +"  "+ getPlaats(); 
    }

    /**
     * @return the plaats
     */
    public String getPlaats() {
        return plaats;
    }

    /**
     * @return the datum
     */
    public Date getDatum() {
        return datum;
    }

    /**
     * @return the tijd
     */
    public String getTijd() {
        return tijd;
    }

    /**
     * @return the inschrijfGeld
     */
    public double getInschrijfGeld() {
        return inschrijfGeld;
    }

    /**
     * @return the event_nr
     */
    public int getEvent_nr() {
        return event_nr;
    }

    /**
     * @return the max_inschrijvingen
     */
    public int getMax_inschrijvingen() {
        return max_inschrijvingen;
    }

    /**
     * @param plaats the plaats to set
     */
    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    /**
     * @param datum the datum to set
     */
    public void setDatum(Date datum) {
        this.datum = datum;
    }

    /**
     * @param tijd the tijd to set
     */
    public void setTijd(String tijd) {
        this.tijd = tijd;
    }

    /**
     * @param inschrijfGeld the inschrijfGeld to set
     */
    public void setInschrijfGeld(double inschrijfGeld) {
        this.inschrijfGeld = inschrijfGeld;
    }

    /**
     * @param max_inschrijvingen the max_inschrijvingen to set
     */
    public void setMax_inschrijvingen(int max_inschrijvingen) {
        this.max_inschrijvingen = max_inschrijvingen;
    }
}
