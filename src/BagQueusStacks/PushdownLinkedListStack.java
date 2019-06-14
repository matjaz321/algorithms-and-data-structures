package BagQueusStacks;

public class PushdownLinkedListStack<Item> extends IteratableLinkedList<Item> {

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        n++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }
}
