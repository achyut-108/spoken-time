package com.smartbear.time;

import com.smartbear.time.util.Constants;
import com.smartbear.time.util.NumberToWordConverter;

public class BritishTimeConverter implements ITimeConverter{

    public String toSpokenTime(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        if (hour == 0 && minute == 0) return Constants.MIDNIGHT;
        if (hour == 12 && minute == 0) return Constants.NOON;

        int nextHour = (hour + 1) % 24;
        String hourWord = Constants.NUMBER_WORDS.get(hour);
        String nextHourWord = Constants.NUMBER_WORDS.get(nextHour);

        return switch (minute) {
            case 0 -> hourWord + Constants.ONE_SPACE + Constants.O_CLOCK;
            case 15 -> Constants.QUATER_PAST + Constants.ONE_SPACE + hourWord;
            case 30 -> Constants.HALF_PAST + Constants.ONE_SPACE + hourWord;
            case 45 -> Constants.QUATER_TO + Constants.ONE_SPACE + nextHourWord;
            default -> {
                if (minute < 30) {
                    yield NumberToWordConverter.numberToWords(minute) + " past " + hourWord;
                } else {
                    int toMin = 60 - minute;
                    yield  NumberToWordConverter.numberToWords(toMin) + " to " + nextHourWord;
                }
            }
        };
    }
}
