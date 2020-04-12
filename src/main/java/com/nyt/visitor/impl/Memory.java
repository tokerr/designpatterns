package com.nyt.visitor.impl;

import com.nyt.visitor.ComputerPart;
import com.nyt.visitor.Visitor;

public class Memory implements ComputerPart {
    @Override
    public void accept(Visitor visitor) {

        visitor.visitMemory(this);
    }

    @Override
    public double getPrice() {
        return 800;
    }
}
