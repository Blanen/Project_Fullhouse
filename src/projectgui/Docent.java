

package projectgui;


public class Docent extends Persoon
{
    private int rekening_nr;


public Docent()
{

}

public String[] geefKolommen()
{
     String[] kolomnamen = { "docentnummer",
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

public void setRekening(int rnr)
{
    this.rekening_nr=rnr;
}
}