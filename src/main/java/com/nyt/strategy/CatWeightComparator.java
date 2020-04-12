package com.nyt.strategy;

//按照Cat的weight进行比较的策略
public class CatWeightComparator implements Comparator<Cat>{
public  int compare(Cat o1, Cat o2){
        if(o1.weight > o2.weight) return 1;
        else if(o1.weight < o2.weight) return -1;
        else return 0;
        }
        }