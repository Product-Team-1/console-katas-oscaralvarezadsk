package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountVowelsTest {
    @Test
    void testCountVowels() {
        assertEquals(2, ConsoleKatas.countVowels("hello"));
        assertEquals(5, ConsoleKatas.countVowels("education"));
    }
}
