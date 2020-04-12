package com.nyt.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * JDK的动态代理，底层使用的ASM字节码操纵工具 和 反射
 *
 * 局限是：JDK动态代理要求被代理类必须要实现接口。但实际上ASM工具，原理实际上生成一个新的二进制字节码
 *
 */
public class Main {

    /*public static void main(String[] args) {


        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");


        Study study = new Study();

        Think proxy= (Think) Proxy.newProxyInstance(Study.class.getClassLoader(),new Class[]{Think.class},new MyInvocationHandler(study));

        proxy.what();



    }*/


    public static void main(String[] args) {


        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");


        Hello hello = new Hello();

        Say say= (Say) Proxy.newProxyInstance(Hello.class.getClassLoader(),new Class[]{Say.class},new SayInvocationHandler(hello));

        say.hello();
        say.hi();


    }
}
