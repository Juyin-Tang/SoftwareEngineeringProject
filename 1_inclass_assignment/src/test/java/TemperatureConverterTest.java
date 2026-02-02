import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    private TemperatureConverter converter;

    @BeforeEach
    void setUp() {
        converter = new TemperatureConverter();
    }

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001);
        assertEquals(-40.0, converter.fahrenheitToCelsius(-40), 0.001);
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001);
    }

    @Test
    void isExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-40.1));
        assertTrue(converter.isExtremeTemperature(50.1));

        assertFalse(converter.isExtremeTemperature(25.0));
        assertFalse(converter.isExtremeTemperature(-40.0));
        assertFalse(converter.isExtremeTemperature(50.0));
    }
}