package first;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class ArcTangentSeriesTest {

    static ArcTangentSeries arcTangentSeries;

    @BeforeAll
    static void setUp() {
        arcTangentSeries = new ArcTangentSeries();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/arctg.csv", numLinesToSkip = 1)
    void decomposeToSeriesTest(double x, int n, double expected, double delta) {
        assertEquals(expected, arcTangentSeries.decomposeToSeries(x, n), delta);
    }
}