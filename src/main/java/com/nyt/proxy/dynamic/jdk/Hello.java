package com.nyt.proxy.dynamic.jdk;

public class Hello implements Say {
    @Override
    public void hi() {
        System.out.println("say hi！");
    }

    @Override
    public void hello() {

        System.out.println("say hello！");
    }
}
