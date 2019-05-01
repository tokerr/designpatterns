package com.nyt.singleton.lazy;

/**
 * 懒汉式-- 给getInstance()方法加synchronized关键字同步
 *
 * 优点
 * 	使用简单，确保了不会同时有两个线程实例化
 * 缺点
 * 	只有第一次执行getInstance()方法，才会需要同步，一旦设置好uniqueinstance变量之后，就不需要同步了，之后的每一次调用加锁都是一种多余，如果程序调用很多，会极大降低程序性能
 */
public class SyncSingleton {

    private static SyncSingleton uniqueInstance;

    private SyncSingleton(){}

    public synchronized static SyncSingleton getInstance(){

        if(uniqueInstance==null){
            uniqueInstance=new SyncSingleton();
        }
        return uniqueInstance;
    }
}
