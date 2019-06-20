package Fundementals;

public class QuickUnionfind extends AbstractUnionFind {

    public QuickUnionfind(int n) {
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }

        return p;
    }

    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (i == j) {
            return;
        }

        id[i] = j;

        count --;
    }
}
