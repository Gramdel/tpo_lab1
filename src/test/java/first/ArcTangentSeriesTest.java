package first;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArcTangentSeriesTest {

    ArcTangentSeries arcTangentSeries;

    @BeforeEach
    void setUp() {
        arcTangentSeries = new ArcTangentSeries();
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForDecomposeToSeries")
    void decomposeToSeriesTest(double x, int n, double expected, double delta) {
        assertEquals(expected, arcTangentSeries.decomposeToSeries(x, n), delta);
    }

    private static Stream<Arguments> provideArgumentsForDecomposeToSeries() {
        return Stream.of(
                Arguments.of(0, 2.4, 5.0),
                Arguments.of(3, 2.5, 5.0),
                Arguments.of(3, 2.5, 5.0)
        );
    }


}