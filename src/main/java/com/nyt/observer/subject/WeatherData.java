package com.nyt.observer.subject;

import com.nyt.observer.subject.interfaca.Observer;
import com.nyt.observer.subject.interfaca.Subject;

import java.util.ArrayList;
import java.util.List;

public  class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    
    private List<Observer> observers;
    
    public WeatherData(){
        observers=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.indexOf(observer)>0){
            observers.remove(observer);
        }

    }

    @Override
    public void notifyObservers() {

        for (Observer o :
                observers) {
            o.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurement(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        notifyObservers();//通知所有观察者状态改变
    }


}
