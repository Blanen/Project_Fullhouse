
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Docent extends Persoon {

    private String rekening_nr;

    public Docent() {

    }

    public Docent(int docent_nr) {
        super(docent_nr);
        try {
            Connection conn = FullHouseDatabase.getConnection();
            Statement stat = conn.createStatement();
            String query = "SELECT * FROM docent where docent_nr =" + docent_nr + ";";
            ResultSet rs = stat.executeQuery(query);
            rs.next();
            this.rekening_nr = rs.getString("rekening_nr");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Docent(String voornaam, String tussenvoegsel, String achternaam, String straat, String huisnummer, String postcode, String woonplaats, String mobielNummer, String vastNummer, String email, String rekening_nr){
        super(voornaam, tussenvoegsel, achternaam, straat, huisnummer, postcode,  woonplaats, mobielNummer, vastNummer, email);
        this.rekening_nr = rekening_nr;
    }

    public String[] geefKolommen() {
        String[] kolomnamen = {
            "docentnummer",
            "rekeningnummer",
            "voornaam",
            "tussenvoegsel",
            "achternaam",
            "straat",
            "huisnummer",
            "woonplaats",
            "postcode",
            "mobielnummer",
            "vast telefoonnummer",
            "emailadres"
        };

        return kolomnamen;
    }

    public void setRekening(String rnr) {
        this.rekening_nr = rnr;
    }
    
    public String getRekening(){
        return rekening_nr;
    }
    
    @Override
    public boolean existsInDB(){
        try{
            String query = " SELECT EXISTS(SELECT docent_nr FROM docent WHERE docent_nr = "+getPNR()+")AS exist;";
            ResultSet rs = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            rs.next();
            return rs.getBoolean("exist");
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
        
    }
    
    @Override
    public boolean writeToDB(){
        if(super.writeToDB()){
            String insert = "INSERT INTO docent (rekening_nr, docent_nr) VALUES(?, ?)";
            String update = "UPDATE docent SET rekening_nr = ? WHERE docent_nr = ?";
            String query;
            if(existsInDB()){
                query = update;
            }else{
                query = insert;
            }
            try{
                PreparedStatement stat = FullHouseDatabase.getConnection().prepareStatement(query);
                stat.setString(1, rekening_nr);
                stat.setInt(2, getPNR());
                stat.executeUpdate();
            }catch(SQLException e){
                System.out.println(e);
                return false;
            }
            return true;
        }else{
            return false;
        }
    }

    
}
