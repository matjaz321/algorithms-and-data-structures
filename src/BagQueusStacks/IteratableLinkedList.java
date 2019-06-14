package BagQueusStacks;

import java.util.Iterator;

public class IteratableLinkedList<Item> implements Iterable<Item> {
    protected Node first;
    protected int n;

    protected class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public Iterator<Item> iterator() {
        return new CustomIterator();
    }

    protected class CustomIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {}

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
