package com.nyt.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SayInvocationHandler implements InvocationHandler {

    private Say say;

    public SayInvocationHandler(Say say){

        this.say=say;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {



        System.out.println("执行之前");

        method.invoke(say,args);

        System.out.println("执行之后");
        return null;
    }
}
