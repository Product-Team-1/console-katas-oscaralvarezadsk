package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumArrayTest {
    @Test
    void testSumArray() {
        assertEquals(6, ConsoleKatas.sumArray(new int[]{1,2,3}));
        assertEquals(0, ConsoleKatas.sumArray(new int[]{}));
    }
}
