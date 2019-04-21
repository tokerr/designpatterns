package com.nyt.observer.observable;

import java.util.Observable;

public class WeatherDate extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public void setMeasurement(float temperature,float humidity,float pressure){

        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        setChanged();//注意，需要标志主题内的状态改变了
        notifyObservers(null);//使用推的方式
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
