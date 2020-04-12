package com.nyt.proxy.staticc;

public class LogProxy implements Moveable {


    private Moveable moveable;

    public  LogProxy(Moveable moveable){
        this.moveable=moveable;

    }
    @Override
    public void move() {
        System.out.println(this.getClass().getName()+":日志拦截开始");
        moveable.move();
        System.out.println(this.getClass().getName()+":日志拦截结束");
    }
}
