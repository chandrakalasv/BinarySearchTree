package com.bridgelab.binary;

public class BinaryTreeImplementation<K extends Comparable> implements IBinary<K> {
    INode<K> root;

    @Override
    public void add(K key) {
        root = addRecursive(root, key);
    }

    public INode<K> addRecursive(INode<K> root, K key) {
        if (root == null)
            return new INode<>(key);

        int compareResult = key.compareTo(root.key);

        if (compareResult == 0) {
            return root;
        } else if (compareResult > 0) {
            root.right = addRecursive(root.right, key);
        } else {
            root.left = addRecursive(root.left, key);
        }
        return root;
    }

    @Override
    public String toString() {
        return "BinaryTreeImplementation{" +
                "root=" + root +
                '}';
    }
}
