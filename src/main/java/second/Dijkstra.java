package second;

import java.util.PriorityQueue;

public class Dijkstra {
    public static int run(int start, int end, int[][] matrix) {
        PriorityQueue<Pair> heap = new PriorityQueue<>();
        heap.add(new Pair(0, start));
        int[] distances = new int[matrix.length-1];

        while (!heap.isEmpty()) {
            Pair p = heap.poll();
            if (distances[p.vertex] != 0) {
                continue;
            }
            if (p.vertex != start) {
                distances[p.vertex] = p.distance;
            }

            for (int i = 0; i < matrix.length; i++) {
                if (distances[i] != 0) {
                    continue;
                }
                heap.add(new Pair(p.distance + matrix[i][i], i));
            }
        }
        return distances[end];
    }
}
