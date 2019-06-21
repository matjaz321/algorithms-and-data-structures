package Fundementals;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UnionFindClient {

    public static void main(String[] args) {
        int n = StdIn.readInt();
//        UnionFind unionFind = new UnionFind(n);
//        QuickUnionfind unionFind = new QuickUnionfind(n);
        WeightedQuickUnionFind unionFind = new WeightedQuickUnionFind(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (unionFind.connected(p, q)) {
                continue;
            }
            unionFind.union(p, q);
            StdOut.println(p + "" +  q);
        }
        StdOut.println(unionFind.count() + "components");
    }
}
