package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOrOddTest {
    @Test
    void testEvenOrOdd() {
        assertEquals("Even", ConsoleKatas.evenOrOdd(4));
        assertEquals("Odd", ConsoleKatas.evenOrOdd(5));
    }
}
