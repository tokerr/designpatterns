package com.nyt.visitor;

public interface Visitor {


    double visitCPU(CPU part);
    double visitMemory(Memory part);
    double visitBoard(Board part);
}
