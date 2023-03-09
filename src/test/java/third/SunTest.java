package third;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SunTest {
    Sun sun;
    Horizon horizon;

    @BeforeEach
    void setUp() {
        sun = new Sun(0, Shape.DOT);
        horizon = new Horizon(false);
    }

    @Test
    void testShine() {
        sun.shine();
        assertEquals(Integer.MAX_VALUE, sun.getBrightness());
    }

    @Test
    void testTransform() {
        sun.transform(Shape.DOT, horizon);
        assertEquals(Shape.DOT, sun.getShape());
        assertEquals(Color.RED, sun.getColor());
        sun.transform(Shape.NARROW_HALF_MOON, horizon);
        assertEquals(Shape.NARROW_HALF_MOON, sun.getShape());
        assertEquals(Color.YELLOW, sun.getColor());
        sun.transform(Shape.FULL_CIRCLE, horizon);
        assertEquals(Shape.FULL_CIRCLE, sun.getShape());
        assertEquals(Color.WHITE, sun.getColor());
    }
}
