import java.util.Scanner; // Import Scanner class
import java.util.Random; // Import Random class

public class NumberGuessingGame3 {// create new class called NumberGuessingGame3
	public static void main(String[] args) {// Main method, used at initialization
		
		Random generator = new Random(); // Random number "generator"
		int secret = generator.nextInt(9) + 1; /* Returns the secret number, between 0 and 9, then adds 1 to get a number between
		1 and 10 */

		String intro = "I have chosen a number between 1 and 10. Try to guess it.\nYour Guess:"; // Intro prompt
		String tryAgain = "That is incorrect. Guess again."; // Used if you guess incorrectly
		String uWon = "That's right! You're a good guesser."; // Used when you guess correctly
		
		System.out.println(intro); // Print the introduction
		
		Scanner scan = new Scanner(System.in); // Instantiate a new Scanner object
		
		String guessString = scan.nextLine(); // Get user input
		int guess = Integer.parseInt(guessString); // Turn the user's response from a string into an integer
		
		while (guess != secret) { // This while loop will continue until or when the user guesses correctly
			System.out.println(tryAgain); // Tell the user to try again
			guessString = scan.nextLine(); // Gather the user's input
			guess = Integer.parseInt(guessString); // Turn the input string into an integer
		}
		
		System.out.println(uWon); // If you get this far, you have passed the while loop, and therefore guessed correctly
		
		scan.close(); // Close the scanner
	}
}
