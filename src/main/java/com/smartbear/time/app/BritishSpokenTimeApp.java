package com.smartbear.time.app;

import java.util.Objects;
import java.util.Scanner;
import com.smartbear.time.SpokenTimeConversionContext;
import com.smartbear.time.util.Constants;

public class BritishSpokenTimeApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        	
        	System.out.println("Please Enter one Country Code from this (UK) : ");
        	String country = scanner.nextLine();
        	
        	System.out.println("Enter the spoken time format from this (24H) : ");
        	String spokenTimeFormat = scanner.nextLine().toUpperCase();
        	
        	String time = null;
        	
			switch (spokenTimeFormat) {
				case Constants.SpokenTimeFormat.TWENTY_FOUR_HOUR -> {
					System.out.print("Enter time in 24-hour format (HH:mm) e.g: (23:59) : ");
					time = scanner.nextLine();
				}
				default -> System.out.println("Incorrect Time Format !! ");
			};
        	
			if(Objects.nonNull(time)) {
				SpokenTimeConversionContext context = new SpokenTimeConversionContext();
				
				String result = context.convert(country, time, spokenTimeFormat);
				System.out.println(country.toUpperCase() + " Spoken Time : " + result);
			}
		}
    }
}