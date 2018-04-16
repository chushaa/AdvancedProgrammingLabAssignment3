/**
 * 
 */
package Lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Shaum Chughtai
 *
 */
public class Lab3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userInput;
		String exitCase;
		Scanner entry = new Scanner(System.in);
		int EXIT = 5;
		
		System.out.println("Please enter the number of the program you would like to use:");
		System.out.println("	1.Password Creator");
		System.out.println("	2.String Counter");
		System.out.println("	3.Phone Number Formater");
		System.out.println("	4.User ID Creator");
		System.out.println("	5.Exit");
		userInput = Integer.parseInt(entry.nextLine());
		
		while(userInput != EXIT) {
			if(userInput == 1) {
				PasswordCreator.passwordCreator();
				System.out.println("Please enter the number of the program you would like to use or enter 5 to Exit the application");
			}else if (userInput == 2) {
				StringCounter.stringCounter();
				System.out.println("Please enter the number of the program you would like to use or enter 5 to Exit the application");
			}else if (userInput == 3) {
				PhoneNumberFormater.phoneNumberFormater();
				System.out.println("Please enter the number of the program you would like to use or enter 5 to Exit the application");
			}else if (userInput == 4){
				IDCreator.IDCreator();
				System.out.println("Please enter the number of the program you would like to use or enter 5 to Exit the application");
			}
			else {
				System.out.println("Invalid entry, please enter a valid number from 1-4 or enter 5 to Exit the program");
			}
			System.out.println("1.Password Creator");
			System.out.println("2.String Counter");
			System.out.println("3.Phone Number Formater");
			System.out.println("4.User ID Creator");
			System.out.println("5.Exit");
			
			userInput = Integer.parseInt(entry.nextLine());
		}
		System.out.println("Thank you for using our application");
		System.out.println("Good Bye!");
		System.out.print("Press any key to continue....");
		exitCase = entry.nextLine();
	}
}
