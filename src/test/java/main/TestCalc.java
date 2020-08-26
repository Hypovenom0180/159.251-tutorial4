package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {

    @Test
    public void testAdd() {
        assertEquals(3, Calc.add(2, 1));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, Calc.subtract(2, 1));
    }
}