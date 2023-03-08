package second;

public class Pair implements Comparable<Pair> {
    int distance;
    int vertex;

    public Pair(int distance, int vertex) {
        this.distance = distance;
        this.vertex = vertex;
    }

    @Override
    public int compareTo(Pair p) {
        return Integer.compare(distance, p.distance);
    }
}
