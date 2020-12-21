package hu.gov.allamkincstar.trainig360.tracking;

import hu.gov.allamkincstar.training360.java.tracking.Class.Vevo;
import org.junit.jupiter.api.Test;


public class VevoTeszt {
    @Test
    public void adatEllenorzes() {

        Vevo vevo = new Vevo();
        vevo.setEmail("kukac@kukac.hu");
        vevo.setLackcim("Valahol");
        vevo.setNev("Teszt Elek");
        vevo.setTelefonszam("123456789");

        Boolean b = vevo.VevoEllenorzes();

        Vevo vevo1 = new Vevo("IttisOttis", "987654321", "Nincs", "");

        Boolean b1 = vevo1.VevoEllenorzes();
    }
}
