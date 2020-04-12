package com.nyt.visitor;

import com.nyt.visitor.impl.*;

public class Computer {


    ComputerPart cpu = new CPU();
    ComputerPart memory = new Memory();
    ComputerPart board=new Board();

    public void metric(Visitor visitor){
        cpu.accept(visitor);
        memory.accept(visitor);
        board.accept(visitor);
    }

    public static void main(String[] args) {
        Computer computer = new Computer();



        Student student = new Student();
        computer.metric(student);

        Employee employee = new Employee();
        computer.metric(employee);


        System.out.println(student.totalPrice);
        System.out.println(employee.totalPrice);

    }
}
