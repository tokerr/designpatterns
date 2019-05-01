package com.nyt.singleton.lazy;

/**
 * 懒汉式 -- 双重检查加锁
 *
 * 优点
 * 	确保了只有第一次调用getInstance()方法才会进行“同步（加锁）”操作，大大减少了后续获取实例的时间
 * 缺点
 * 	uniqueInstance变量需要volatile关键字修饰。这个关键字在jdk1.4之前（包括）会导致双重检查加锁失效
 */
public class DoubleCheckedLockingSingleton {

    private volatile  static DoubleCheckedLockingSingleton uniqueInstance;

    private DoubleCheckedLockingSingleton(){}

    public static DoubleCheckedLockingSingleton getInstance(){
        if(uniqueInstance==null){
            synchronized(DoubleCheckedLockingSingleton.class){
                if(uniqueInstance==null){
                    uniqueInstance=new DoubleCheckedLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
