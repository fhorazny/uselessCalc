package com.redhat.fhorazny.first;

public class Tree<T> {
    private Node<T> root;

    public Tree() {
        root = null;
    }

    public Tree(Node<T> root) {
        this.root = root;
    }
}
