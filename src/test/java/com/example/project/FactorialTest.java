package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    @Test
    void testFactorial() {
        assertEquals(1, ConsoleKatas.factorial(0));
        assertEquals(120, ConsoleKatas.factorial(5));
    }
}
