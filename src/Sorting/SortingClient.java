package Sorting;

import edu.princeton.cs.algs4.StdIn;

public class SortingClient {
    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
//        new SelectionSort().sort(a);
//        new InsertionSort().sort(a);
//        new ShellSort().sort(a);
//        new TopDownMergeSort().sort(a);
//        new BottomUpMergeSort().sort(a);
//        assert AbstractSort.isSorted(a);
        new QuickSort().sort(a);
        AbstractSort.show(a);
    }
}
