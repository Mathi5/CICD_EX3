package epsi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for CalculatorAlgo.
 */
public class CalculatorAlgoTest {

    /**
     * Test adding two numbers.
     */
    @Test
    public void shouldAddTwoNumbers()
    {
        assertEquals("2 + 3 should be 5", 5, CalculatorAlgo.add(2, 3));
    }
}
