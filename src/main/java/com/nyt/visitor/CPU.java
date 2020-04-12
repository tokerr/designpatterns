package com.nyt.visitor;

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
