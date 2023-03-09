package third;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HorizonTest {
    Horizon horizon;

    @BeforeEach
    void setUp() {
        horizon = new Horizon(false);
    }

    @Test
    void testFireUp() {
        horizon.fireUp();
        assertTrue(horizon.isFiredUp());
        assertEquals(Color.WHITE, horizon.getColor());
    }

    @Test
    void testPutFireOut() {
        horizon.putFireOut();
        assertFalse(horizon.isFiredUp());
        assertEquals(Color.BLACK, horizon.getColor());
    }
}
