
package com.smartbear.time;

public class USTimeConverterStrategy implements ITimeConverterStrategy {
    @Override
    public String toSpokenTime24HourFormat(String input) {
        return "We will support this US style Soon : " + input;
    }
}
