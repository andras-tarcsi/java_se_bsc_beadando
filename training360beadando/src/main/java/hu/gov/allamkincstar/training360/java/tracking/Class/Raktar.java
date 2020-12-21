package hu.gov.allamkincstar.training360.java.tracking.Class;

import hu.gov.allamkincstar.training360.java.tracking.Exception.RaktarException;

import java.util.HashMap;
import java.util.Map;

public class Raktar {
    private Map<Aru, Integer> raktarKeszlet = new HashMap<>();

    public Raktar(Map<Aru, Integer> raktarKeszlet) {
        this.raktarKeszlet = raktarKeszlet;
    }

    public Map<Aru, Integer> getRaktarKeszlet() {
        return raktarKeszlet;
    }

    public void setRaktarKeszlet(Map<Aru, Integer> raktarKeszlet) {
        this.raktarKeszlet = raktarKeszlet;
    }

    public Integer mennyiRaktarKeszlet(Aru aru) {
        if (this.raktarKeszlet.containsKey(aru) &&
                !this.raktarKeszlet.get(aru).equals(null) &&
                this.raktarKeszlet.get(aru) > 0) {
            return this.raktarKeszlet.get(aru);
        } else {
            return 0;
        }
    }

    public void addRaktar (Aru aru, Integer darab){
        if (raktarKeszlet.containsKey(aru)) {
            raktarKeszlet.put(aru, raktarKeszlet.get(aru) + darab);
        }
        else{
            this.raktarKeszlet.put(aru,darab);
        }
    }

    public  void csokkentRaktar(Aru aru, Integer darab) throws RaktarException {
        if (raktarKeszlet.get(aru) < darab || raktarKeszlet.get(aru).equals(null)) {
            throw new RaktarException();
        }
        else {
            raktarKeszlet.put(aru, raktarKeszlet.get(aru) - darab);
        }
    }
}
