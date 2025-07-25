package com.smartbear.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

public class BritishTimeConverterStrategyTest {
	
	private ITimeConverterStrategy converter;

    @BeforeEach
    void setUp() {
        converter = new BritishTimeConverterStrategy();
    }

    @Test
    void testNoonAndMidnight() {
        assertEquals("midnight", converter.toSpokenTime24HourFormat("00:00"));
        assertEquals("noon", converter.toSpokenTime24HourFormat("12:00"));
    }

    @Test
    void testExactHours() {
        assertEquals("ten o'clock", converter.toSpokenTime24HourFormat("10:00"));
    }

    @Test
    void testQuarterPast() {
        assertEquals("quarter past three", converter.toSpokenTime24HourFormat("03:15"));
    }

    @Test
    void testHalfPast() {
        assertEquals("half past eight", converter.toSpokenTime24HourFormat("08:30"));
    }

    @Test
    void testQuarterTo() {
        assertEquals("quarter to six", converter.toSpokenTime24HourFormat("05:45"));
        assertEquals("quarter to twelve", converter.toSpokenTime24HourFormat("11:45"));
    }

    @Test
    void testMinutesPast() {
        assertEquals("five past nine", converter.toSpokenTime24HourFormat("09:05"));
        assertEquals("one past ten", converter.toSpokenTime24HourFormat("10:01"));
    }

    @Test
    void testMinutesTo() {
        assertEquals("ten to four", converter.toSpokenTime24HourFormat("03:50"));
        assertEquals("one to one", converter.toSpokenTime24HourFormat("12:59"));
    }
}
