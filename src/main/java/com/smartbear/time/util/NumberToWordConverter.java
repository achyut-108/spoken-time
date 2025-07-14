package com.smartbear.time.util;

public class NumberToWordConverter {
	
	public static String numberToWords(int number) {
        String[] ones = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"
        };
        String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty"
        };

        if (number < 20) return ones[number];
        int tenPart = number / 10;
        int onePart = number % 10;
        return tens[tenPart] + (onePart > 0 ? " " + ones[onePart] : "");
    }

}
