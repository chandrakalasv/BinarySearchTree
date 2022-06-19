package com.bridgelab.binary;

public interface IBinary <K extends Comparable>{
    void add(K key);
    int size();
}
