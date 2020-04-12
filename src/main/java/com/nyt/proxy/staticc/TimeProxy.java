package com.nyt.proxy.staticc;

public class TimeProxy implements Moveable {

    private Moveable moveable;


    public TimeProxy(Moveable moveable){
        this.moveable=moveable;
    }

    @Override
    public void move() {

        System.out.println(this.getClass().getName()+":开始时间");
        moveable.move();
        System.out.println(this.getClass().getName()+":结束时间");

    }
}
