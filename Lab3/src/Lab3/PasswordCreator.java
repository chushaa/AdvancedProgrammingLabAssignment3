package Lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordCreator {
	public static void passwordCreator() {
		int lowerBound = 6;
		int upperBound = 10;
		String password;
		Scanner passwordAttempt = new Scanner(System.in);
		String passwordCheck = "";
		int inPasswordCheck = 0;
		
		System.out.println("Password Creator");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println("Please enter the password you would like to use (Make sure to include a number and at least 1 upper case letter)");
		password = passwordAttempt.nextLine();
		
		while (!password.equals(passwordCheck)) {
			if (password.length() >= lowerBound && password.length() <= upperBound) {
				FOR_LOOP:
				for(int i = 0; i < password.length(); i++) {
					Character x = password.charAt(i);
					if(x.isDigit(password.charAt(i)) == true) {
						inPasswordCheck = 1;
						break FOR_LOOP;
					}
				}
				if (inPasswordCheck == 1) {
					FINAL_FOR_LOOP:
						for(int y = 0; y < password.length(); y++) {
							Character c = password.charAt(y);
							inPasswordCheck = 0;
							if(c.isUpperCase(password.charAt(y)) == true) {
								inPasswordCheck = 1;
								break FINAL_FOR_LOOP;
							}
						}
						if(inPasswordCheck == 1) {
							System.out.println("This is a valid password");
							System.out.println("If you would like to check another password, please enter one now, or hit enter to return to the main program");
							password = passwordAttempt.nextLine();
						}else {
							System.out.println("This is not a valid password, please make sure to include at least one capital letter");
							password = passwordAttempt.nextLine();
						}
				}else {
					System.out.println("This password does not have a numaric value, please enter another password");
					password = passwordAttempt.nextLine();
				}
			}else {
				System.out.println("This password does not meet the valid length requirements, it must be between 6 and 10 characters");
				password = passwordAttempt.nextLine();
			}
		}	
	}
}
