import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import second.AdjacencyMatrix;
import second.Dijkstra;
import second.Result;

import static org.junit.jupiter.api.Assertions.*;

class DijkstraTest {

    private AdjacencyMatrix matrix;

    @BeforeEach
    void setUp() {
        /*

        0 3 5 0 0
        3 0 3 6 0
        5 3 0 1 0
        0 6 1 0 0
        0 0 0 0 0

         */

        matrix = new AdjacencyMatrix(5);
        matrix.addEdge(0, 1, 3);
        matrix.addEdge(0, 2, 5);
        matrix.addEdge(1, 2, 3);
        matrix.addEdge(2, 3, 1);
        matrix.addEdge(1, 3, 6);
    }

    @ParameterizedTest
    @CsvFileSource(resources= "dijkstra.csv", numLinesToSkip = 1)
    void runTest(int start, int end, int expectedDistance, String expectedPath) {
        assertEquals(new Result(expectedDistance, expectedPath), Dijkstra.run(start, end, matrix));
    }
}