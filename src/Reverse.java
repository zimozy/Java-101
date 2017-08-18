import java.util.*; // Import Scanner class

public class Reverse { // Define Reverse class
   
	public static void main (String[] args) { // Main() function, used at execution
		String input, reverse, result; // Prepare to use input String 
		Scanner scan; // Prepare to user Scanner scan
		StringBuilder builder; // Prepare to user StringBuilder builder
		
		scan = new Scanner(System.in); // Create new scanner called "scan"
   
		System.out.println("Please type something and press enter:"); // Prompt the user
     
		input = scan.nextLine(); // Get user input, put into the scan object
		scan.close(); // Close the scanner
		
		input = input.toLowerCase(); // Make the input lower case (so that case doesn't matter in the test below)
		builder = new StringBuilder(); // Create StringBuilder for reversing text
		builder.append(input); // Insert the text to the StringBuilder
		builder = builder.reverse(); // Reverse the text
		reverse = builder.toString(); // Turn StringBuilder into String

		result = (input.equals(reverse)) ? "YES. What you typed is a palindrome." : "NO. What you typed is not a palindrome.";
		// Set the result based on whether the reverse matches the input 
		
		System.out.println(result); // Tell the user the result of the program
   }
}
