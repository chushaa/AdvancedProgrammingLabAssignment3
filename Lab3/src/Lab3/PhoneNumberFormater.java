package Lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneNumberFormater {
	public static void phoneNumberFormater() {
		String userInput;
		Scanner userEntry = new Scanner(System.in);
		String inputCheck = "";
		int phoneNumberState = 0;
		String finalPhoneNumber;
		
		System.out.println("Phone Number Formater");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("This program will take in a phone number and format it into proper phone formatting");
		System.out.println("Please enter a number");
		userInput = userEntry.nextLine();
		
		while (!userInput.equals(inputCheck)) {
			while(!(userInput.length() == 10)) {
				System.out.println("This is not a 10 digit number, please enter a valid 10 digit number");
				userInput = userEntry.nextLine();
			}
			DIGIT_CHECK:
				for(int i = 0; i < userInput.length(); i++) {
					Character x = userInput.charAt(i);
					if(x.isDigit(userInput.charAt(i)) == false) {
						System.out.println("There is a non number in this phone number, please enter a 10 digit number");
						phoneNumberState = 1;
						break DIGIT_CHECK;
					}
				}
			if(phoneNumberState == 0) {
				System.out.println(String.valueOf(userInput).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"));
				System.out.println("Enter another phone number, or hit enter to return to the main program");
				userInput = userEntry.nextLine();
			}else {
				System.out.println("Enter another phone number, or hit enter to return to the main program");
				phoneNumberState = 0;
				userInput = userEntry.nextLine();
			}
		}
	}
}
