/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectgui;

/**
 *
 * @author Babita
 */
public class Toernooi_inschrijving {
 private String inschrijfstatus;
 private Toernooi toernooi;
 private Speler speler;
 
public Toernooi_inschrijving()
{
    
}
 
public String getInschrijfStatus()
{
    return inschrijfstatus;
}
public Persoon getSpeler()
{
return speler;    
}
public Toernooi getToernooi()
{
    return toernooi;
}
public void setInschrijfStatus(String is)
{
    inschrijfstatus=is;
}
public void setSpeler(Speler sp)
{
    speler=sp;
}
public void setToernooi(Toernooi tn)
{
    toernooi=tn;
}

}
