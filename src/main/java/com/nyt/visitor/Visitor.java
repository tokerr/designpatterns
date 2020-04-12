package com.nyt.visitor;

import com.nyt.visitor.impl.Board;
import com.nyt.visitor.impl.CPU;
import com.nyt.visitor.impl.Memory;

public interface Visitor {


    double visitCPU(CPU part);
    double visitMemory(Memory part);
    double visitBoard(Board part);
}
