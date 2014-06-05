/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Babita
 */
public class Persoon {
    
    private int persoon_nr;
    private String voornaam;
    private String achternaam;
    private String straat;
    private String huisnummer;
    private String tussenvoegsel;
    private String postcode;
    private String woonplaats;
    private String mobiel_nr;
    private String vast_nr;
    private String emailadres;
    

public void setNr(int nr)
{
this.persoon_nr=nr;
}
public void setNaam(String vn, String tv, String an)
{
    this.voornaam= vn;
    this.tussenvoegsel=tv;
    this.achternaam=an;
}

public void setAdres(String strt, String hnr, String wpl, String pc)
{
    this.straat=strt;
    this.huisnummer= hnr;
    this.woonplaats=wpl;
    this.postcode=pc;
    
}

public void setContactGegevens(String mnr, String vnr, String email)
{
    this.mobiel_nr=mnr;
    this.vast_nr=vnr;
    this.emailadres=email;
}

public int getPNR()
{
 return     persoon_nr ;
         }
public String getVoornaam()
{
    
            return voornaam; 
                    }

public String getAchternaam()
{
    
            return achternaam ;
                    }
public String getTussenvoegsel()
{
    return tussenvoegsel;
}
public String getStraat()
{
            return straat;
}
public String getHuisnummer()
{
            return huisnummer;
                    }

public String getWoonplaats()
{
            return woonplaats ;
                    }
public String getPostcode()
{
            return postcode ;
                    }
public String getMNR()
{
            return mobiel_nr ;
                    }
public String getVNR(){
            return vast_nr;
                    }

public String getEmail()
{
            return emailadres;
}

}