package com.smartbear.time.app;

import java.util.Scanner;

import com.smartbear.time.BritishTimeConverter;
import com.smartbear.time.ITimeConverter;

public class BritishSpokenTimeApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter time in 24-hour format (HH:mm): ");
			String input = scanner.nextLine();
			ITimeConverter timeConverter = new BritishTimeConverter();
			String result = timeConverter.toSpokenTime(input);
			System.out.println("British Spoken Time: " + result);
		}
    }
}