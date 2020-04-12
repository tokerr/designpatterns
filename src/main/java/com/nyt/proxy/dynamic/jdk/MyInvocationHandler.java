package com.nyt.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {


    Think think;

    public  MyInvocationHandler(Think think){

        this.think=think;
    }


    public Object invoke(Object proxy, Method method , Object[] args) throws InvocationTargetException, IllegalAccessException {

        System.out.println("执行前");
        Object invoke = method.invoke(think, args);
        System.out.println("执行后");

        return invoke;
    }
}
