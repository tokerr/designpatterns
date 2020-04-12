package com.nyt.visitor.impl;

import com.nyt.visitor.Visitor;

public class Employee  implements Visitor {

    public double totalPrice;

    @Override
    public double visitCPU(CPU part) {

        return totalPrice+=part.getPrice()*0.9;
    }

    @Override
    public double visitMemory(Memory part) {
        return totalPrice+=part.getPrice()*0.85;
    }

    @Override
    public double visitBoard(Board part) {
        return totalPrice+=part.getPrice()*0.75;
    }
}
