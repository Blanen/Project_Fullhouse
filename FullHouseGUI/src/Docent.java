
public class Docent extends Persoon {

    private int rekening_nr;

    public Docent() {

    }

    public Docent(int docent_nr) {
    }

    public String[] geefKolommen() {
        String[] kolomnamen = {"docentnummer",
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

    public void setRekening(int rnr) {
        this.rekening_nr = rnr;
    }

    @Override
    public String toString() {
        return getVoornaam() + " " + getTussenvoegsel()+ " " + getAchternaam() + ", " + getEmail();
    }
}
