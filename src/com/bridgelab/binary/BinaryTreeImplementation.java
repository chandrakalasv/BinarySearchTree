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
    public int size() {
        return getSizeRecursively(root);
    }

    @Override
    public INode<K> search(K key) {
        return searchRecursive(root, key);
    }
    public INode<K> searchRecursive(INode<K> root, K key) {
        if(root == null || root.key == key) {
            return root;
        }
        if (root.key.compareTo(key) > 0) {
            return searchRecursive(root.left, key);
        } else {
            return searchRecursive(root.right, key);
        }
    }

    int count;
    public int getSizeRecursively(INode<K> root) {
        if (root == null) {
         return  count += 0;
        } else {
            count += 1;
        }
        getSizeRecursively(root.left);
        getSizeRecursively(root.right);
        return count;
    }

    @Override
    public String toString() {
        return "BinaryTreeImplementation{" +
                "root=" + root +
                '}';
    }
}
