package com.nyt.observer.observable;

import com.nyt.observer.subject.DisplayElemenet;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElemenet {
    private float temperature;
    private float humidity;
    private float pressure;

    private Observable observable;

    public CurrentConditionDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);

    }

    @Override
    public void display() {
        System.out.println(this);

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof  WeatherDate){
            WeatherDate weatherDate=(WeatherDate)o;

            //使用拉的方式更新数据，arg为主题推送过来的数据
            this.humidity=weatherDate.getHumidity();
            this.pressure=weatherDate.getPressure();
            this.temperature=weatherDate.getTemperature();
        }
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
