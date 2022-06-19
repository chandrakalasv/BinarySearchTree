package com.bridgelab.binary;

public class BinaryTreeMain {
    public static void main(String[] args) {
        System.out.println("binary search tree implementation");
        IBinary<Integer> binary = new BinaryTreeImplementation();
        binary.add(56);
        binary.add(30);
        binary.add(70);
        binary.add(22);
        binary.add(40);
        binary.add(11);
        binary.add(3);
        binary.add(16);
        binary.add(60);
        binary.add(95);
        binary.add(65);
        binary.add(63);
        binary.add(67);
        System.out.println(binary.size());
    }
}
