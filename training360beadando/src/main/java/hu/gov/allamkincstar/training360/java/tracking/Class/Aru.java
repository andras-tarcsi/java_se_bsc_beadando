package hu.gov.allamkincstar.training360.java.tracking.Class;

public class Aru {

    private Integer aruId;
    private Integer ar;
    private String arunev;

    public Aru(Integer aruId, Integer ar, String arunev) {
        this.aruId = aruId;
        this.ar = ar;
        this.arunev = arunev;
    }

    public Aru() {
    }

    public Integer getAruId() {
        return aruId;
    }

    public void setAruId(Integer aruId) {
        this.aruId = aruId;
    }

    public Integer getAr() {
        return ar;
    }

    public void setAr(Integer ar) {
        this.ar = ar;
    }

    public String getArunev() {
        return arunev;
    }

    public void setArunev(String arunev) {
        this.arunev = arunev;
    }
}
