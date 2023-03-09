package second;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra {
    public static Result run(int start, int end, AdjacencyMatrix m) {
        PriorityQueue<Pair> heap = new PriorityQueue<>();
        int[][] matrix = m.asArray();
        int[] distances = new int[matrix.length];
        boolean[] visited = new boolean[matrix.length];
        int[] prev = new int[matrix.length];

        heap.add(new Pair(0, start));
        Arrays.fill(distances, Integer.MAX_VALUE / 2);
        Arrays.fill(visited, false);
        Arrays.fill(prev, -1);
        distances[start] = 0;

        while (!heap.isEmpty()) {
            Pair p = heap.poll();
            visited[p.vertex] = true;

            for (int i = 0; i < matrix.length; i++) {
                if (matrix[p.vertex][i] != 0 && distances[i] > p.distance + matrix[p.vertex][i]) {
                    distances[i] = p.distance + matrix[p.vertex][i];
                    if (!visited[i]) {
                        heap.add(new Pair(distances[i], i));
                        prev[i] = p.vertex;
                    }
                }
            }
        }
        return new Result(distances[end], new StringBuilder(getPath(prev, end)).reverse().toString());
    }

    private static String getPath(int[] prev, int vertex) {
        if (vertex == -1) {
            return "";
        }
        return vertex + " " + getPath(prev, prev[vertex]);
    }
}
