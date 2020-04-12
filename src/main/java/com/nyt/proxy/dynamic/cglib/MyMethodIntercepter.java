package com.nyt.proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodIntercepter implements MethodInterceptor {


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("这个是产生的代理对象："+o.getClass().getName());

        Object invoke =methodProxy.invokeSuper(o,objects);

//        Object invoke = method.invoke(o, objects);

        return invoke;
    }
}
