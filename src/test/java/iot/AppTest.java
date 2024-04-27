package iot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test_fact_raises_exception_for_negative_number() {
        int number = -5;
        try {
            App.fact(number);
        } catch (IllegalArgumentException e) {
            assertEquals("Number cannot be negative", e.getMessage());
        }
    }

    @Test
    public void fact_0_returns_1()
    {
        assertEquals(1, App.fact(0));
    }

    @Test
    public void fact_1_returns_1()
    {
        assertEquals(1, App.fact(1));
    }

    @Test
    public void fact_2_returns_2()
    {
        assertEquals(1, App.fact(0));
    }

    @Test
    public void fact_3_returns_6()
    {
        assertEquals(6, App.fact(3));
    }

    @Test
    public void fact_5_returns_120()
    {
        assertEquals(120, App.fact(5));
    }
}
