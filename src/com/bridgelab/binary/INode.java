package com.bridgelab.binary;

public class INode <K extends Comparable>{
    K key;
    INode<K> left;
    INode<K> right;

    public INode(K key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "INode{" +
                "key=" + key +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
