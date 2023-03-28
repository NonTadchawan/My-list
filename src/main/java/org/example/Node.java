package org.example;

public class Node {
    Object value;
    Node next;

    public Node(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
