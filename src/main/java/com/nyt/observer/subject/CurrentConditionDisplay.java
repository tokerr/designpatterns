package com.nyt.observer.subject;

import com.nyt.observer.subject.interfaca.Observer;
import com.nyt.observer.subject.interfaca.Subject;

public class CurrentConditionDisplay implements Observer,DisplayElemenet {
    private float temperature;
    private float humidity;
    private float pressure;

    private Subject subject;



    public CurrentConditionDisplay(Subject subject){
        this.subject=subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(this);

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        display();

    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
