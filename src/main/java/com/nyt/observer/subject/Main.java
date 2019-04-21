package com.nyt.observer.subject;

public class Main {

    public static void main(String[] args) {
        WeatherData subject=new WeatherData();
        CurrentConditionDisplay observer=new CurrentConditionDisplay(subject);
        subject.setMeasurement(80,65,46.4f);
        subject.setMeasurement(70,56,30.4f);
        subject.setMeasurement(60,23,29.4f);
    }
}
