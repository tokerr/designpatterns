package com.nyt.proxy.staticc;

/**
 * 静态代理：被代理类和代理类都需要实现同一个接口
 *
 * 缺点 ：需要为每种不同的代理逻辑编写代理类
 *
 */
public class Main {


    public static void main(String[] args) {


        MyMoveable myMoveable = new MyMoveable();


        TimeProxy timeProxy = new TimeProxy(myMoveable);


//        timeProxy.move();


        LogProxy logProxy = new LogProxy(timeProxy);

        logProxy.move();
    }
}
