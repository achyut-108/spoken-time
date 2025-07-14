package com.smartbear.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

public class BritishTimeConverterTest {
	
	private ITimeConverter converter;

    @BeforeEach
    void setUp() {
        converter = new BritishTimeConverter();
    }

    @Test
    void testNoonAndMidnight() {
        assertEquals("midnight", converter.toSpokenTime("00:00"));
        assertEquals("noon", converter.toSpokenTime("12:00"));
    }

    @Test
    void testExactHours() {
        assertEquals("ten o'clock", converter.toSpokenTime("10:00"));
    }

    @Test
    void testQuarterPast() {
        assertEquals("quarter past three", converter.toSpokenTime("03:15"));
    }

    @Test
    void testHalfPast() {
        assertEquals("half past eight", converter.toSpokenTime("08:30"));
    }

    @Test
    void testQuarterTo() {
        assertEquals("quarter to six", converter.toSpokenTime("05:45"));
        assertEquals("quarter to twelve", converter.toSpokenTime("11:45"));
    }

    @Test
    void testMinutesPast() {
        assertEquals("five past nine", converter.toSpokenTime("09:05"));
        assertEquals("one past ten", converter.toSpokenTime("10:01"));
    }

    @Test
    void testMinutesTo() {
        assertEquals("ten to four", converter.toSpokenTime("03:50"));
        assertEquals("one to one", converter.toSpokenTime("12:59"));
    }
}
