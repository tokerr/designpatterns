package com.nyt.singleton.eagerly;


/**
 * 饿汉式 --单件模式
 * 在jvm加载该类时立即创建该类的单件实例。jvm保证在任何线程在访问uniqueInstance静态变量之前,一定先创建此类的实例
 *
 * 优点
 * 	编写简单，在jvm加载这个类的时候就去创建唯一的单件对象
 * 缺点
 * 	如果程序运行当中，并没有使用到这个实例，就造成了一种浪费
 */
public class EagerlySingleton {

    private static EagerlySingleton uniqueInstance=new EagerlySingleton();

    private EagerlySingleton(){}

    public static EagerlySingleton getInstance(){
        return uniqueInstance;
    }
}
