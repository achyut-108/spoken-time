package com.smartbear.time;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.smartbear.time.util.Constants;

public class SpokenTimeConversionContextTest {

    private SpokenTimeConversionContext context;

    @BeforeEach
    void setUp() {
        context = new SpokenTimeConversionContext();
    }

    @Test
    void testValidUKTimeConversion24H() {
        String result = context.convert("UK", "13:15", "24H");
        assertEquals("quarter past one", result);
    }

    @Test
    void testValidUSTimeConversion24H() {
        String result = context.convert("UK", "12:00", "24H");
        assertEquals("noon", result);
    }

    @Test
    void testValidIndianTimeConversion24H() {
        String result = context.convert("uk", "00:00", "24H");
        assertEquals("midnight", result);
    }

    @Test
    void testInvalidTimeFormat() {
        String result = context.convert("UK", "13:15", "12H");
        assertEquals("UnSupported Format : 12H", result);
    }

    @Test
    void testInvalidTimeValue() {
        String result = context.convert("UK", "25:00", "24H");
        assertEquals(Constants.ErrorMessages.INVALID_SPOKEN_TIME, result);
    }

    @Test
    void testUnsupportedCountry() {
        String result = context.convert("FR", "10:00", "24H");
        assertEquals("We will serve for this country sooner !!", result);
    }

    @Test
    void testNullCountryCode() {
        String result = context.convert(null, "10:00", "24H");
        assertEquals(Constants.ErrorMessages.INVALID_INPUT, result);
    }

    @Test
    void testNullTimeValue() {
        String result = context.convert("UK", null, "24H");
        assertEquals(Constants.ErrorMessages.INVALID_INPUT, result);
    }
}
