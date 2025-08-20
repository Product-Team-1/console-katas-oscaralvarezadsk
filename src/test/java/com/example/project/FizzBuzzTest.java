package com.example.project;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    void testFizzBuzz() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        try {
            ConsoleKatas.fizzBuzz();
            String[] lines = bos.toString().replace("\r","").split("\n");
            assertEquals(100, lines.length);
            assertEquals("1", lines[0]);
            assertEquals("Fizz", lines[2]);
            assertEquals("Buzz", lines[4]);
            assertEquals("FizzBuzz", lines[14]);
            assertEquals("Buzz", lines[99]);
        } finally {
            System.setOut(originalOut);
        }
    }
}
