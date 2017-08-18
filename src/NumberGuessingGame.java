import java.util.Scanner; // Import Scanner functionality

public class NumberGuessingGame { // Begin class description
	
	public static void main(String[] args) { // Main argument
		
		String response; // Used in the conditional below
		int secret = 4; // The secret number
		String intro = "TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!\nI\"M THKING OF A NBR FROM 1-10.  TRY 2 GESS!"; /* Intro
		text, used below */
		String uWon = "LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS" + secret; // This is used when you win
		String uLost = "W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS" + secret; // This string is used when you guess incorrectly
		
		System.out.println(intro); 					// Print the introduction
		
		Scanner scan = new Scanner(System.in); // Instantiate a Scanner object
		
		String guessString = scan.nextLine();		// Get user input
		scan.close();								// Close the scanner object
		int guess = Integer.parseInt(guessString);	// Turn the user's response from a string into an integer
		
		if (guess == secret) { // Determine how to respond to the user
			response = uWon; // Set the response prompt if they win
		} else {
			response = uLost; // Set the response prompt if they are incorrect
		}
		
		System.out.println(response);	// Respond based on the user's input
										// Nice and clean; only one line of "System.out.prinln()" for either response

	}

}
