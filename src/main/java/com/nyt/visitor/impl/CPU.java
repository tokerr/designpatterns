package com.nyt.visitor.impl;

import com.nyt.visitor.ComputerPart;
import com.nyt.visitor.Visitor;

public class CPU implements ComputerPart {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCPU(this);
    }

    @Override
    public double getPrice() {
        return 1000;
    }
}
