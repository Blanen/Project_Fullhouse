
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
public class Toernooi extends Event{
    
    private int tafelGrootte;
    private int rondes;
    private ArrayList <Tafel> tafels = new ArrayList();
    private ArrayList <ToernooiInschrijving> inschrijvingen = new ArrayList();
    
    
    public Toernooi(String plaats, Date datum, String tijd, double inschrijfGeld, int tafelGrootte, int rondes){
        super(plaats, datum, tijd, inschrijfGeld);
        this.tafelGrootte = tafelGrootte;
        this.rondes = rondes;
    }
    
    public Toernooi(int toernooi_nr){
        super(toernooi_nr);
        String query = "SELECT * FROM toernooi WHERE toernooi_nr = "+toernooi_nr+";";
        Connection conn = null;
        try{
            Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery(query);
            result.next();
            tafelGrootte = result.getInt("tafelgrootte");
            rondes = result.getInt("rondes");
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    @Override
    public boolean existsInDB(){
         String query = "SELECT EXISTS(toernooi_nr) AS exists FROM toernooi WHERE toernooi_nr = "+getEventNr()+";";
         Connection conn = null;
         try{
          Statement stat = conn.createStatement();
          ResultSet result = stat.executeQuery(query);
          result.next();
          return result.getBoolean("exists");
         }catch(SQLException e){
             System.out.println(e);
             return false;
         }
    }
    
    @Override
    public void writeToDB(){
        super.writeToDB();
        String update = "UPDATE toernooi set tafelGrootte = "+tafelGrootte+", rondes = "+rondes+" WHERE toernooi_nr = "+getEventNr()+";";
        String write = "INSERT INTO toernooi VALUES("+getEventNr()+", "+ tafelGrootte +", "+ rondes+");";
        Connection conn = null;
        Statement stat = null;
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

}
