import java.util.ArrayList;

public class CET {

    private ArrayList<Observador> observers = new ArrayList<Observador>();

    public void addObserver(Observador o) {
        observers.add(o);
    }

    public void removeObserver(Observador o) {
        observers.remove(o);
    }

    public void notificarObservadores() {
        for (Observador o : observers) {
            o.update(this);
        }
    }
}
