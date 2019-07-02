package Sorting;

public class BottomUpMergeSort extends AbstractSort {
    private static Comparable[] aux;

    @Override
    public void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, a.length);
    }

    private static void sort(Comparable[] a, int n){
        for (int len = 1; len < n; len *= 2) {
            for (int lo = 0; lo < n - len; lo += len+len) {
                merge(a, lo, lo+len-1, Math.min(lo+len+len-1, n-1));
            }
        }
    }

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;

        // copy array.
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi ; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }
}
