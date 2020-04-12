package com.nyt.visitor.impl;

import com.nyt.visitor.Visitor;

public class Student implements Visitor {

    public double totalPrice;

    @Override
    public double visitCPU(CPU part) {
        return totalPrice+=part.getPrice()*0.7d;
    }

    @Override
    public double visitMemory(Memory part) {

        return  totalPrice+=part.getPrice()*0.7d;
    }

    @Override
    public double visitBoard(Board part) {

        return totalPrice+=part.getPrice()*0.5d;
    }
}
