package Lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCounter {
	public static void stringCounter() {
		String userInput;
		Scanner userEntry = new Scanner(System.in);
		String inputCheck = "";
		int totalCount = 0;
		
		System.out.println("String Counter");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("This program will take in user input and count the number of characters in it, excluding spaces, hyphans, apostraphies, etc...");
		System.out.println("Please enter a string");
		userInput = userEntry.nextLine();
		
		while (!userInput.equals(inputCheck)) {
			String[] splitUserInput = userInput.split("\\s+|-|_|!|@|#|$|%|(|)|:|;|'|,|.|\\?");
			
			for(String x : splitUserInput) {
				int tempValue = x.length();
				totalCount += tempValue;
				tempValue = 0;
			}
			System.out.println("The total size of the letters in your string is: " + totalCount);
			System.out.println("If you would like to count another string, please enter it now, or hit enter to return to the program selector.");
			totalCount = 0;
			userInput = userEntry.nextLine();
		}
	}
}
