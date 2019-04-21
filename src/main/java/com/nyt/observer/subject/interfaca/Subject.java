package com.nyt.observer.subject.interfaca;

public interface Subject {

    //register
    void registerObserver(Observer observer);

    //remove
    void removeObserver(Observer observer);

    //notify
    void notifyObservers();
}
