package app.framework.entity;

public interface Observable {
    void registerObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObservers(Event event, Object ob);
}
