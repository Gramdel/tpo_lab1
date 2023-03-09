package second;

public class AdjacencyMatrix {
    private final int[][] array;

    public AdjacencyMatrix(int n) {
        array = new int[n][n];
    }

    public void addEdge(int start, int end, int distance) {
        array[start][end] = distance;
        array[end][start] = distance;
    }

    public int[][] asArray() {
        return array;
    }
}
