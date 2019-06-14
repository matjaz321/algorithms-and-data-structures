package BagQueusStacks;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class IteratableLinkedListClient {

    public static void main(String[] args) {
//        PushdownLinkedListStack<String> s = new PushdownLinkedListStack<String>();
//        FIFOQueueLinkedList<String> s = new FIFOQueueLinkedList<String>();
        LIFOBagLinkedList<String> s = new LIFOBagLinkedList<String>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
//                s.push(item);
//                s.enqueue(item);
                s.add(item);
            } else if (!s.isEmpty()) {
//                StdOut.print(s.pop() + " ");
//                StdOut.print(s.dequeue() + " ");
            }
        }

        StdOut.println("(" + s.size() + " left on stack)");
    }
}
