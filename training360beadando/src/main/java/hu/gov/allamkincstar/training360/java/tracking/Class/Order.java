package hu.gov.allamkincstar.training360.java.tracking.Class;

import hu.gov.allamkincstar.training360.java.tracking.Enum.VasarlasiMod;
import hu.gov.allamkincstar.training360.java.tracking.Enum.FizetesiMod;
import hu.gov.allamkincstar.training360.java.tracking.Enum.Statusz;

public class Order {
    private String Id;
    private Vevo vevo = new Vevo();
    private Aru aru = new Aru();
    private VasarlasiMod vasarlasiMod;
    private FizetesiMod fizetesiMod;
    private Statusz statusz;
    private String megjegyzes;

    public Order(String id, Vevo vevo, Aru aru, VasarlasiMod vasarlasiMod, FizetesiMod fizetesiMod, Statusz statusz, String megjegyzes) {
        Id = id;
        this.vevo = vevo;
        this.aru = aru;
        this.vasarlasiMod = vasarlasiMod;
        this.fizetesiMod = fizetesiMod;
        this.statusz = statusz;
        this.megjegyzes = megjegyzes;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Vevo getVevo() {
        return vevo;
    }

    public void setVevo(Vevo vevo) {
        this.vevo = vevo;
    }

    public Aru getAru() {
        return aru;
    }

    public void setAru(Aru aru) {
        this.aru = aru;
    }

    public VasarlasiMod getVasarlasiMod() {
        return vasarlasiMod;
    }

    public void setVasarlasiMod(VasarlasiMod vasarlasiMod) {
        this.vasarlasiMod = vasarlasiMod;
    }

    public FizetesiMod getFizetesiMod() {
        return fizetesiMod;
    }

    public void setFizetesiMod(FizetesiMod fizetesiMod) {
        this.fizetesiMod = fizetesiMod;
    }

    public Statusz getStatusz() {
        return statusz;
    }

    public void setStatusz(Statusz statusz) {
        this.statusz = statusz;
    }

    public String getMegjegyzes() {
        return megjegyzes;
    }

    public void setMegjegyzes(String megjegyzes) {
        this.megjegyzes = megjegyzes;
    }
}
