package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromeTest {
    @Test
    void testIsPalindrome() {
        assertTrue(ConsoleKatas.isPalindrome("madam"));
        assertTrue(ConsoleKatas.isPalindrome("RaceCar"));
        assertTrue(ConsoleKatas.isPalindrome("nurses run"));
        assertFalse(ConsoleKatas.isPalindrome("hello"));
    }
}
