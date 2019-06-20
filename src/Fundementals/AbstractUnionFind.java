package Fundementals;

public abstract class AbstractUnionFind {
    protected int[] id;
    protected int count;

    abstract public void union(int p, int q);

    abstract public int find(int p);

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int count() {
        return count;
    }
}
