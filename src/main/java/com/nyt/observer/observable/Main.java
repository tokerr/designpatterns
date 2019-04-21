package com.nyt.observer.observable;

public class Main {

    public static void main(String[] args) {
        WeatherDate subject=new WeatherDate();
        CurrentConditionDisplay observer=new CurrentConditionDisplay(subject);

        subject.setMeasurement(80,65,46.4f);
        subject.setMeasurement(111,56,30.4f);
        subject.setMeasurement(60,23,29.4f);
    }
}
