package com.smartbear.time.util;
import java.util.regex.Pattern;

public class TimeValidator {
	
    private static final Pattern TIME_24H_PATTERN = Pattern.compile(
        "^([01]\\d|2[0-3]):[0-5]\\d$"
    );

    /**
     * Valid inputs: "00:00" to "23:59"
     * 
     * Invalid if missing leading zeros or having extra characters
     * 
     * Regex explanation:
     * 
     * ([01]\\d|2[0-3]) matches 00 to 23
     * 
     * :[0-5]\\d matches :00 to :59
     * 
     * @param time
     * @return
     */
    
    public static boolean isValid24HourTime(String time) {
        if (time == null) return false;
        return TIME_24H_PATTERN.matcher(time).matches();
    }
}
