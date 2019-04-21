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
        notifyObservers(null);//需要推送的参数为空，观察者需要自己'拉'取数据
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
