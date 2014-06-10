/*
 * 
 */

package eloratingtest;

/**
 * @author Matthias
 */
public class Speler {
    private double rating;
    
    public Speler (double rating) {
        this.rating = rating;
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }
    
    public double getRating() {
        return this.rating;
    }
}
