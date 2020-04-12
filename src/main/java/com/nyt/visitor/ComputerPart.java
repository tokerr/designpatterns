package com.nyt.visitor;

public interface ComputerPart {

    void accept(Visitor visitor);

    double getPrice();
}
