package Lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IDCreator {
	public static void IDCreator() {
		String nameInput;
		Scanner nameEntry = new Scanner(System.in);
		String[] nameSplit;
		List<String> nameInitials = new ArrayList<String>();
		String addressInput;
		Scanner addressEntry = new Scanner(System.in);
		String[] addressSplit;
		String addressNumberCode;
		String inputCheck = "";
		String userID = "";
		String EXIT = "";
		
		System.out.println("User ID Creator");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("This program will take in a Name and an Address and generate a User Id from it");
		
		System.out.println("Please enter your full name (Ex: John Doe):");
		nameInput = nameEntry.nextLine();
		nameSplit = nameInput.split(" ");
		
		while(!nameInput.equals(EXIT)) {
			System.out.println("Please enter your street address (Ex: 111 Address Lane):");
			addressInput = addressEntry.nextLine();
			addressSplit = addressInput.split(" ");
			
			for (int i = 0; i < nameSplit.length; i++) {
				Character x = nameSplit[i].charAt(0);
				nameInitials.add(x.toString());
			}
			
			addressNumberCode = addressSplit[0];
			
			//USED FOR GETING THE INITIALS STORED IN THE LIST
			for (int x = 0; x < nameInitials.size(); x++) {
				userID += nameInitials.get(x);
			}
			
			userID += addressNumberCode;
			
			System.out.println("Your auto-generated UserID is: " + userID);
			System.out.println("If you would like to generate another UserID, enter another full name, or hit enter to return to the main program");
			nameInput = nameEntry.nextLine();
			nameSplit = nameInput.split(" ");
		}
	}
}
