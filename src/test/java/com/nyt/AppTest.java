package com.nyt;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void iplusplus(){

        int i=10;

        int j=10;

        int a=i++;

        int b=++j;

        System.out.println(a);//10
        System.out.println(b);//11

    }



    @Test
    public void syncTest(){

        ExecutorService threadPool = Executors.newCachedThreadPool();


        for (int i=0;i<100;i++){

            final  int j=i;
        threadPool.execute(()->{
//            getLockStatic(j);
            getLock(j);
//            getLockNon(j);
        });
        }


    }

    public static synchronized void getLockStatic(int i){

//        Objects
//        Thread.currentThread();
        System.out.println(Thread.currentThread().getName()+"-"+i);
    }
    public synchronized void getLock(int i){
        System.out.println(Thread.currentThread().getName()+"-"+i);
    }

    public  void getLockNon(int i){
        System.out.println(Thread.currentThread().getName()+"-"+i);
    }

}
