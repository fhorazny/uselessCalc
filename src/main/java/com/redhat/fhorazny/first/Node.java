package com.redhat.fhorazny.first;

public interface Node<T> {
    <T> T getValue();
    Node<T> getLeft();
    Node<T> getRight();
}
