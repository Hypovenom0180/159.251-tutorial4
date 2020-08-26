package main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalc {

    @Test
    void testAdd() {
        assertEquals(2, Calc.add(1,1));
    }

}