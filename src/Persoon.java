
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Babita
 */
public class Persoon {

    private int persoon_nr;
    private String voornaam;
    private String achternaam;
    private String straat;
    private String huisnummer;
    private String tussenvoegsel;
    private String postcode;
    private String woonplaats;
    private String mobiel_nr;
    private String vast_nr;
    private String emailadres;

    public Persoon() {

    }

    public Persoon(String voornaam, String tussenvoegsel, String achternaam, String straat, String huisnummer, String postcode, String woonplaats, String mobielNummer, String vastNummer, String email) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.tussenvoegsel = tussenvoegsel;
        this.straat = straat;
        this.huisnummer = huisnummer;
        this.postcode = postcode;
        this.woonplaats = woonplaats;
        this.mobiel_nr = mobielNummer;
        this.vast_nr = vastNummer;
        this.emailadres = email;
    }

    public Persoon(int persoon_nr) {
        this.persoon_nr = persoon_nr;
        try {
            Connection conn = FullHouseDatabase.getConnection();
            Statement stat = conn.createStatement();
            String query = "SELECT * FROM persoon where persoon_nr =" + persoon_nr + ";";
            ResultSet rs = stat.executeQuery(query);

            while (rs.next()) {

                setNaam(rs.getString("voornaam"), rs.getString("tussenvoegsel"), rs.getString("achternaam"));
                setAdres(rs.getString("straat"), rs.getString("huisnummer"), rs.getString("woonplaats"), rs.getString("postcode"));
                setContactGegevens(rs.getString("mobiel_nr"), rs.getString("vast_nr"), rs.getString("emailadres"));

            }

        } catch (Exception e) {

        }
    }

    public void setNr(int nr) {
        this.persoon_nr = nr;
    }

    public void setNaam(String vn, String tv, String an) {
        this.voornaam = vn;
        this.tussenvoegsel = tv;
        this.achternaam = an;
    }

    public void setAdres(String strt, String hnr, String wpl, String pc) {
        this.straat = strt;
        this.huisnummer = hnr;
        this.woonplaats = wpl;
        this.postcode = pc;

    }

    public void setContactGegevens(String mnr, String vnr, String email) {
        this.mobiel_nr = mnr;
        this.vast_nr = vnr;
        this.emailadres = email;
    }

    public int getPNR() {
        return persoon_nr;
    }

    public String getVoornaam() {

        return voornaam;
    }

    public String getAchternaam() {

        return achternaam;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public String getStraat() {
        return straat;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getMNR() {
        return mobiel_nr;
    }

    public String getVNR() {
        return vast_nr;
    }

    public String getEmail() {
        return emailadres;
    }

    public boolean existsInDB() {
        try {
            String query = "SELECT EXISTS(SELECT persoon_nr FROM persoon WHERE persoon_nr = " + getPNR() + ")AS exist;";
            ResultSet rs = FullHouseDatabase.getConnection().createStatement().executeQuery(query);
            rs.next();
            return rs.getBoolean("exist");
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean writeToDB() {
        String insert = "INSERT INTO persoon VALUES(" + persoon_nr + ",?,?,?,?,?,?,?,?,?,?);";
        String update = "UPDATE persoon SET voornaam = ?, tussenvoegsel = ?, achternaam = ?, straat = ?, huisnummer = ?, postcode = ?, woonplaats = ?, mobiel_nr = ?, vast_nr = ?, emailadres = ? WHERE persoon_nr = " + persoon_nr + ";";
        String query;
        if (existsInDB()) {
            query = update;
        } else {
            query = insert;
        }
        try {
            PreparedStatement stat = FullHouseDatabase.getConnection().prepareStatement(query);
            stat.setString(1, voornaam);
            stat.setString(2, tussenvoegsel);
            stat.setString(3, achternaam);
            stat.setString(4, straat);
            stat.setString(5, huisnummer);
            stat.setString(6, postcode);
            stat.setString(7, woonplaats);
            stat.setString(8, mobiel_nr);
            stat.setString(9, vast_nr);
            stat.setString(10, emailadres);

            stat.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;

    }

}
