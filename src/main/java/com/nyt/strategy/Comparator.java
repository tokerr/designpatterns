package com.nyt.strategy;

public interface Comparator<T>{
    //比较两个对象的大小
//  o1 > 02 返回1
// o1 < o2 返回-1
// o1 ==o2 返回0
    int compare(T o1, T o2);

}