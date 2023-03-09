package third;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GoodMorningTest {
    GoodMorning goodMorning;

    @BeforeEach
    void setUp() {
        goodMorning = new GoodMorning(new Sun(0, Shape.DOT), new Horizon(false));
    }

    @Test
    void testStart() {
        assertTrue(goodMorning.start());
    }
}
