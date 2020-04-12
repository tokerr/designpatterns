package com.nyt.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Main {


    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(NoInterface.class);

        enhancer.setCallback(new MyMethodIntercepter());

        NoInterface o = (NoInterface) enhancer.create();

        o.action();

    }
}
