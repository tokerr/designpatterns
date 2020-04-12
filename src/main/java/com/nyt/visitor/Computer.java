package com.nyt.visitor;

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
        Student student = new Student();


        Computer computer = new Computer();

        computer.metric(student);


        System.out.println(student.totalPrice);

    }
}
