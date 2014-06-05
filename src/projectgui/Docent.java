

package projectgui;


public class Docent extends Persoon
{
    private String rekening_nr;


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

public void setRekening(String rnr)
{
    this.rekening_nr=rnr;
}
}