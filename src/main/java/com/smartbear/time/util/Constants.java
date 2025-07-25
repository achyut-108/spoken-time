package com.smartbear.time.util;

import java.util.Map;

public class Constants {
    public static final Map<Integer, String> NUMBER_WORDS = Map.ofEntries(
        Map.entry(0, "twelve"), Map.entry(1, "one"), Map.entry(2, "two"), Map.entry(3, "three"),
        Map.entry(4, "four"), Map.entry(5, "five"), Map.entry(6, "six"), Map.entry(7, "seven"),
        Map.entry(8, "eight"), Map.entry(9, "nine"), Map.entry(10, "ten"), Map.entry(11, "eleven"),
        Map.entry(12, "twelve"), Map.entry(13, "one"), Map.entry(14, "two"), Map.entry(15, "three"),
        Map.entry(16, "four"), Map.entry(17, "five"), Map.entry(18, "six"), Map.entry(19, "seven"),
        Map.entry(20, "eight"), Map.entry(21, "nine"), Map.entry(22, "ten"), Map.entry(23, "eleven")
    );
    
    public static final String MIDNIGHT = "midnight";
    public static final String NOON = "noon";
    public static final String O_CLOCK = "o'clock";
    public static final String ONE_SPACE = " ";
    public static final String QUATER_PAST = "quarter past";
    public static final String HALF_PAST = "half past";
    public static final String QUATER_TO = "quarter to";
    
    public static class Country {
        public static final String INDIA = "IN";
        public static final String USA = "US";
        public static final String UK = "UK";
    }
    
    public static class SpokenTimeFormat {
        public static final String TWENTY_FOUR_HOUR = "24H";
        public static final String TWELVE_HOUR = "12H";
    }
    
    
    public static class ErrorMessages {
        public static final String INVALID_SPOKEN_TIME = "Invalid Spoken Time";
        public static final String INVALID_INPUT = "Invalid Input";
    }
    
}
