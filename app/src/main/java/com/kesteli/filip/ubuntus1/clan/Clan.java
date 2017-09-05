package com.kesteli.filip.ubuntus1.clan;

/**
 * Created by Valemate on 3.9.2017..
 */

public class Clan {

    private String idClan;
    private String ime;
    private String prezime;
    private String eMail;
    private int godine;
    private int brojUspjesnihTransakcija;
    private int fizika;
    private int matematika;
    private int vesMasina;
    private int mobitel;
    private int kompjutor;
    private int automobil;
    private int poljoprivreda;
    private int gradevina;
    private int pazitelj;

    public Clan() {
    }

    public Clan(String idClan, String ime, String prezime, String eMail, int godine, int brojUspjesnihTransakcija, int fizika, int matematika, int vesMasina, int mobitel, int kompjutor, int automobil, int poljoprivreda, int gradevina, int pazitelj) {
        this.idClan = idClan;
        this.ime = ime;
        this.prezime = prezime;
        this.eMail = eMail;
        this.godine = godine;
        this.brojUspjesnihTransakcija = brojUspjesnihTransakcija;
        this.fizika = fizika;
        this.matematika = matematika;
        this.vesMasina = vesMasina;
        this.mobitel = mobitel;
        this.kompjutor = kompjutor;
        this.automobil = automobil;
        this.poljoprivreda = poljoprivreda;
        this.gradevina = gradevina;
        this.pazitelj = pazitelj;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public int getBrojUspjesnihTransakcija() {
        return brojUspjesnihTransakcija;
    }

    public void setBrojUspjesnihTransakcija(int brojUspjesnihTransakcija) {
        this.brojUspjesnihTransakcija = brojUspjesnihTransakcija;
    }

    public int getAutomobil() {
        return automobil;
    }

    public void setAutomobil(int automobil) {
        this.automobil = automobil;
    }

    public String getIdClan() {
        return idClan;
    }

    public void setIdClan(String idClan) {
        this.idClan = idClan;
    }

    public int getFizika() {
        return fizika;
    }

    public void setFizika(int fizika) {
        this.fizika = fizika;
    }

    public int getMatematika() {
        return matematika;
    }

    public void setMatematika(int matematika) {
        this.matematika = matematika;
    }

    public int getVesMasina() {
        return vesMasina;
    }

    public void setVesMasina(int vesMasina) {
        this.vesMasina = vesMasina;
    }

    public int getMobitel() {
        return mobitel;
    }

    public void setMobitel(int mobitel) {
        this.mobitel = mobitel;
    }

    public int getKompjutor() {
        return kompjutor;
    }

    public void setKompjutor(int kompjutor) {
        this.kompjutor = kompjutor;
    }

    public int getPoljoprivreda() {
        return poljoprivreda;
    }

    public void setPoljoprivreda(int poljoprivreda) {
        this.poljoprivreda = poljoprivreda;
    }

    public int getGradevina() {
        return gradevina;
    }

    public void setGradevina(int gradevina) {
        this.gradevina = gradevina;
    }

    public int getPazitelj() {
        return pazitelj;
    }

    public void setPazitelj(int pazitelj) {
        this.pazitelj = pazitelj;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}




