/*
 * 
 */

package eloratingtest;
import java.util.ArrayList;

/**
 * @author Matthias
 */

public class EloRatingTest {

    public static void main(String[] args) {
        ArrayList<Speler> spelers = new ArrayList();
        for(int i=0; i<8; i++) {
            double randomRating = (Math.random() * 1000) + 1000;
            Speler speler = new Speler(randomRating);
            spelers.add(speler);
        }
        
        for(Speler speler : spelers) {
            int spelerNummer = spelers.indexOf(speler) + 1;
            System.out.println("Speler " + spelerNummer + "\t" + (int) speler.getRating());
        }
        
        System.out.println("\nSpeler 5 wint\n");
        Speler winnaar = spelers.get(4);
        
        RatingCalculator.calculateRatings(spelers, winnaar);
        
        for(Speler speler : spelers) {
            int spelerNummer = spelers.indexOf(speler) + 1;
            System.out.println("Speler " + spelerNummer + "\t" + (int) speler.getRating());
        }
    }

}
