/*
 * 
 */

import java.util.ArrayList;

/**
 * @author Matthias
 */
public class RatingCalculator {
    private static final int kFactor = 32;
    
    public static void calculateRatings(ArrayList<Speler> spelers, Speler winnaar) {
        for(Speler speler : spelers) {
            double expectedScore = 0;
            double actualScore;
            
            if(speler != winnaar) {
                expectedScore = calcExpectedScore (speler, winnaar);
                actualScore = 0;
            } else {
                for(Speler verliezer : spelers) {
                    expectedScore = expectedScore + calcExpectedScore (speler, verliezer);
                }
                actualScore = spelers.size() - 1;
            }
            speler.setRating( calcNewRating(speler.getRating(), expectedScore, actualScore));
        }
    }
    
    private static double calcExpectedScore(Speler spelerA, Speler spelerB) {
        double expectedScore =  1 / ( 1 + Math.pow(10, ( ( spelerB.getRating() - spelerA.getRating() ) / 400 ) ) );
        return expectedScore;
    }
    
    private static double calcNewRating (double rating, double expectedScore, double actualScore) {
        double newRating = rating + ( kFactor * (actualScore - expectedScore) );
        return newRating;
    }
}