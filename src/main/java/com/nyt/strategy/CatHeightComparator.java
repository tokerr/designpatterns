package com.nyt.strategy;

//按照Cat的Height进行比较的策略
public class CatHeightComparator implements  Comparator<Cat>{
public  int compare(Cat o1, Cat o2){
        if(o1.height > o2.height ) return 1;
        else if(o1.height < o2.height) return -1;
        else return 0;
        }

        }
