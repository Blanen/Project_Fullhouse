

package projectgui;

import javax.swing.table.DefaultTableModel;


public class Speler extends Persoon {
    private double rating;
    private double gewonnen_geld;
    


public Speler()
{

}
public String[] geefKolomNamen()
{
     String[] kolomnamen = {    "spelernummer",
                                "rating",
                                "voornaam",
                                "tussenvoegsel",
                                "achternaam",
                                "straat",
                                "huisnummer",
                                "woonplaats",
                                "postcode",
                                "emailadres",
                                "mobielnummer",
                                "vast nummer",
                                "gewonnen_geld"
                                                 };

     return kolomnamen;

}
public void setRating(double r)
{
    this.rating=r;
}
public void setGewonnenGeld(double gg)
{
    this.gewonnen_geld=gg;
}

public double getRating()
{
    return rating;
}
public double getGeld()
{
    return gewonnen_geld;
}

@Override
public String toString(){
    
    if(getTussenvoegsel()!=null)
    {
    return getVoornaam()+" "+getTussenvoegsel()+" "+getAchternaam();
}
    else{
        return getVoornaam()+" "+getAchternaam();
    }
}
}