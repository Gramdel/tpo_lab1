package second;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra {
    private static final int INF = Integer.MAX_VALUE / 2;

    public static String run(int start, int end, AdjacencyMatrix m) {
        PriorityQueue<Pair> heap = new PriorityQueue<>();
        int[][] matrix = m.asArray();
        int[] distances = new int[matrix.length];
        boolean[] visited = new boolean[matrix.length];
        int[] prev = new int[matrix.length];

        heap.add(new Pair(0, start));
        Arrays.fill(distances, INF);
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

        if (distances[end] != INF) {
            int curr = end;
            StringBuilder builder = new StringBuilder();
            while (curr != -1) {
                builder.append(curr).append(" ");
                curr = prev[curr];
            }
            return distances[end] + " : " + builder.reverse().toString().trim();
        }
        return "NO PATH";
    }
}