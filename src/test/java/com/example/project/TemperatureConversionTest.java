package com.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConversionTest {
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, ConsoleKatas.celsiusToFahrenheit(0), 1e-6);
        assertEquals(212.0, ConsoleKatas.celsiusToFahrenheit(100), 1e-6);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, ConsoleKatas.fahrenheitToCelsius(32), 1e-6);
        assertEquals(100.0, ConsoleKatas.fahrenheitToCelsius(212), 1e-6);
    }
}
