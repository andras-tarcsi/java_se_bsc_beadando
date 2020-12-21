package hu.gov.allamkincstar.training360.java.tracking.Class;

import hu.gov.allamkincstar.training360.java.tracking.Exception.KosarException;
import hu.gov.allamkincstar.training360.java.tracking.Exception.KosarUresException;
import hu.gov.allamkincstar.training360.java.tracking.Exception.RaktarException;

import java.util.HashMap;
import java.util.Map;

public class Kosar {
    private Map<Aru, Integer> kosarAruLista = new HashMap<>();

    public void kosarbaArutTesz(Aru aru, Integer darab, Raktar raktar) throws KosarException, RaktarException {
        if (raktar.mennyiRaktarKeszlet(aru) >= darab) {
            if (kosarAruLista.containsKey(aru)) {
                this.kosarAruLista.put(aru, this.kosarAruLista.get(aru) + darab);
            } else {
                this.kosarAruLista.put(aru, darab);
            }
            raktar.csokkentRaktar(aru, darab);
        } else
            throw new KosarException();
    }

    public void kosarDarabModosit(Aru aru, Integer darab, Raktar raktar) throws RaktarException, KosarException {
        if (this.kosarAruLista.containsKey(aru) &&
                darab > kosarAruLista.get(aru)) {
            if (raktar.mennyiRaktarKeszlet(aru) > darab) {
                this.kosarAruLista.put(aru, this.kosarAruLista.get(aru) + darab);
                raktar.csokkentRaktar(aru, kosarAruLista.get(aru) - darab);
            } else {
                throw new KosarException();
            }
        } else {
            raktar.addRaktar(aru, kosarAruLista.get(aru) - darab);
            this.kosarAruLista.put(aru, darab);
        }
    }

    public void kosarTorol(Raktar raktar, Aru aru) throws KosarUresException, RaktarException, KosarException {
        if (kosarAruLista.isEmpty()) {
            throw new KosarUresException();
        }

        for (Map.Entry<Aru, Integer> aruEntry : kosarAruLista.entrySet()) {
            raktar.csokkentRaktar(aruEntry.getKey(), -1 * aruEntry.getValue());
        }
    }

    public Map<Aru, Integer> getKosarAruLista() {
        return kosarAruLista;
    }

    public void setKosarAruLista(Map<Aru, Integer> kosarAruLista) {
        this.kosarAruLista = kosarAruLista;
    }

    public Kosar(Map<Aru, Integer> kosarAruLista) {
        this.kosarAruLista = kosarAruLista;
    }
}
