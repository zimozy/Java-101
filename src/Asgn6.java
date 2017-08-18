// Example using if/else, switch/case, variables, and boolean values
import java.util.Scanner; // Import Scanner class

public class Asgn6 { // describe the Asgn6 class
	public static void main(String[] args) { // main() function, used at initialization
		System.out.println("Welcome to Animal Zone. Please type in an African animal in lower case:"); // prompt the user 
		
		Scanner scan = new Scanner(System.in); // create Scanner object
		
		String input = scan.nextLine(); // Set String "input" to the user input
		scan.close(); // close scanner object
		
		String funFact = null; // Initialize a fun fact variable
		boolean Asian = false; // BOOLEAN: set if the animal is actually Asian
		switch (input) { // SWITCH: See if we have the animal on our "database"
		case "lion": funFact = " . . . you chose the King of the Jungle?"; break; // if the animal is a lion
		case "zebra": funFact = "the stripes of a zebra confuse a lion, making them harder to catch?"; break; // if the animal is a zebra
		case "leopard": funFact = ". . . Watch out! Leopards can climb trees--don't get caught under one!"; break; // if the animal is a leopard
		case "tiger": funFact = "tigers love to swim, unlike our domestic felines?"; // if the animal is a tiger
			Asian = true; // we will point out that tigers are not african
			break; // ends the "case" block of code, otherwise the next case would also be run
		case "impala": funFact = "impala reach 33 to 39 inches (measured at their shoulders)?"; break; // if the animal is an impala
		}
		
		if (funFact == null) { // IF/ELSE: If the animal wasn't identified, tell the user
			System.out.println("Whoops -- we don't have that animal in our database. Sorry."); // tell the user via the console
			return; // the main() function will stop here if this line is executed
		}
		
		System.out.println("Fun Fact: Did you know that " + funFact); // tell user the fun fact
		
		if (Asian) { // BOOLEAN TEST: If they typed "tiger", Asian will be true, and the user will see this message
			System.out.println("But WAIT! -- You chose the tiger, which is not an African animal. "
					+ "They are native to Asia.");	// tell the user tigers are from Africa
		}
	}
}
