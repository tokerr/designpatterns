package com.nyt.proxy.staticc;

public class MyMoveable implements Moveable {

    @Override
    public void move() {

        System.out.println(this.getClass().getName()+":running man!");
    }
}
