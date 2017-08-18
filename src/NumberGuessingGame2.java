import java.util.Scanner; // Import Scanner class
import java.util.Random; // Import Random class

public class NumberGuessingGame2 { // create new class called NumberGuessingGame2
	public static void main(String[] args) { // Main method, used at initialization
		
		String response; // Used in the conditional below
		Random generator = new Random(); // This object can give us a random number
		int secret = generator.nextInt(9) + 1; // Returns number between 0 and 9, then we add 1 to get a number between 1 and 10
		String intro = "I'm thinking of a number from 1 to 10.\nYour guess: "; // Intro text
		String uWon = "That's right!  My secret number was " + secret; 	/* Text to display if user is correct. "secret" gets
		to end of sentence */
		String uLost = "Sorry, but I was really thinking of " + secret; // Text to display if user is incorrect
		
		System.out.println(intro); // Print the introduction
		
		Scanner scan = new Scanner(System.in); // Instantiate a Scanner object called "scan".
		
		String guessString = scan.nextLine(); // Get user input
		scan.close(); // Close the scanner object
		int guess = Integer.parseInt(guessString); // Turn the user's response into an integer
		
		if (guess == secret) { // Determine how to respond to the user
			response = uWon; // Set the response if the user is correct
		} else {
			response = uLost; // Set the response if the user is incorrect
		}
		
		System.out.println(response); /* Output the results
		Nice and clean; only one containing "System.out.prinln()" for either response */
	}
}
