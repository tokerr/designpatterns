package com.nyt.strategy;

public class Main {

    public static void main(String[] args) {

        new CatHeightComparator().compare(new Cat(2,3),new Cat(8,2));

        Comparator<Cat> comparator=(o1,o2)->{
            if(o1.weight > o2.weight) return 1;
            else if (o1.weight < o2.weight) return -1;
            else return 0;
        };
    }
}
