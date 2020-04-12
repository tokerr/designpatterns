package com.nyt.visitor.impl;

import com.nyt.visitor.ComputerPart;
import com.nyt.visitor.Visitor;

public class Board implements ComputerPart {
    @Override
    public void accept(Visitor visitor) {

        visitor.visitBoard(this);
    }

    @Override
    public double getPrice() {
        return 500;
    }
}
