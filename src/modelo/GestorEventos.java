package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public class GestorEventos extends Observable {

    private static GestorEventos gestorEventos;
    Map<String, ArrayList> mapaObservers = new HashMap<String, ArrayList>();

    public GestorEventos() {
    }

    public static GestorEventos getInstance() {
        if (gestorEventos == null) {
            gestorEventos = new GestorEventos();
        }
        return gestorEventos;
    }

    public void suscribir(Observer observer, String tipoEvento) {
        ArrayList observers;
        observers = mapaObservers.get(tipoEvento);
        if (observers == null) {
            observers = new ArrayList();
            mapaObservers.put(tipoEvento, observers);
        }
        observers.add(observer);
    }

    public void publicar(String tipoEvento, Object info) {
        ArrayList<Observer> observers;

        observers = mapaObservers.get(tipoEvento);
        if (observers != null) {
            for (Observer observer : observers) {
                observer.update(this, info);
            }
        }
    }
}
