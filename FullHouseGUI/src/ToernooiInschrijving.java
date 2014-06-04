/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Regi
 */
public class ToernooiInschrijving {

    private Speler speler;
    private Toernooi toernooi;
    private boolean isBetaald;

    public ToernooiInschrijving(Speler speler, Toernooi toernooi, boolean isBetaald) {
        this.speler = speler;
        this.toernooi = toernooi;
        this.isBetaald = isBetaald;
    }
}
