package hu.gov.allamkincstar.training360.java.tracking.Class;


public class Vevo {
    private String lackcim;
    private String telefonszam;
    private String nev;
    private String email;


    public Boolean VevoEllenorzes() {
        if (this.email.equals(null) || this.nev.equals(null) || this.telefonszam.equals(null) || this.lackcim.equals(null)) {
            return false;
        }
        return true;
    }


    public Vevo(String lackcim, String telefonszam, String nev, String email) {
        this.lackcim = lackcim;
        this.telefonszam = telefonszam;
        this.nev = nev;
        this.email = email;
    }

    public Vevo() {

    }


    public String getLackcim() {
        return lackcim;
    }

    public void setLackcim(String lackcim) {
        this.lackcim = lackcim;
    }

    public String getTelefonszam() {
        return telefonszam;
    }

    public void setTelefonszam(String telefonszam) {
        this.telefonszam = telefonszam;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
