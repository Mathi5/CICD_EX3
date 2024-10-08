package epsi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Unit test for CalculatorService.
 */
public class CalculatorServiceTest {

    /**
     * Test adding two numbers.
     */
    @Test
    public void shouldAddThreeNumbers()
    {
        assertEquals("2 + 3 + 1 should be 6", 6, new CalculatorService().add(Arrays.asList(2, 3, 1)));
    }
}
