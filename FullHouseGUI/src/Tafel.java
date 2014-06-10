
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
    }

    public void writeToDB() {

    }
}
