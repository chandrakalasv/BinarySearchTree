package com.bridgelab.binary;

public class BinaryTreeMain {
    public static void main(String[] args) {
        System.out.println("binary search tree implementation");
        IBinary<Integer> binary = new BinaryTreeImplementation();
        binary.add(56);
        binary.add(30);
        binary.add(70);
        System.out.println(binary);
    }
}
