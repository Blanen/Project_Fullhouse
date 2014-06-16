/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Regi
 */
public abstract class Inschrijving {
    private int speler;
    private boolean isBetaald;
    
    public Inschrijving(int speler, boolean isBetaald){
        this.speler = speler;
        this.isBetaald = isBetaald;
    }
    
    public boolean isBetaald(){
        return isBetaald;
    }
    
    public Speler getSpeler(){
        return new Speler(speler);
    }
    
    public int getSpelerID(){
        return speler;
    }
    
    public void setBetaald(boolean betaald){
        isBetaald = betaald;
    }

    public abstract Event getEvent();
    
    public abstract void writeToDB();
    
    @Override
    public String toString(){
        return Boolean.toString(isBetaald);
    }
}
