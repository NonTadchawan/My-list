package org.example;

import java.util.Iterator;

public class MyList implements Iterable {
    Node head;
    Node current;
    int size;

    public void add(Object value) {
        if (head == null) {
            head = new Node(value);
            current = head;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
            current = current.next;
        }
        size++;
    }

    public boolean contain(Object value) {
        this.current = this.head;
        System.out.println("Value : " + value);
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current=current.next;
        }
        System.out.println("---This value not contain in MyList---");
        return false;
    }

    public void remove(Object value) {
        current = head;
        Node currentIndex=head;
        Node prev = null;
        if (contain(value)) {
            while (currentIndex != null) {
                if (currentIndex.value.equals(value)) {
                    if (prev == null) {
                        head = currentIndex.next;

                    } else {
                       prev.next =currentIndex.next;
                    }
                    break;
                } else {
                    prev = currentIndex;
                    currentIndex = currentIndex.next;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "[" +
                "head=" + head +
                ", current=" + current +
                ']';
    }

    public Iterator iterator() {
        return new Iterator() {
            Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Object next() {
                Object value = current.value;
                current = current.next;
                return value;
            }

            @Override
            public void remove() {

            }
        };
    }
}
