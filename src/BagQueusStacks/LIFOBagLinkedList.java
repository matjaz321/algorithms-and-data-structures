package BagQueusStacks;

import java.util.Iterator;

public class LIFOBagLinkedList<Item> extends IteratableLinkedList<Item> {

    public void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public Iterator<Item> iterator() {
        return new BagIterator();
    }

    protected class BagIterator extends CustomIterator {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

}
