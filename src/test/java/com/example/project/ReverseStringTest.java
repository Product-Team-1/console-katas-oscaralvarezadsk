package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {
    @Test
    void testReverseString() {
        assertEquals("avaJ", ConsoleKatas.reverseString("Java"));
        assertEquals("", ConsoleKatas.reverseString(""));
    }
}
