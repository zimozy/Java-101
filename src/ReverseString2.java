import java.util.Scanner;// import scanner class

public class ReverseString2 {// define a new class

	public static void main(String[] args) { // main function, used when ReverseString2 object is created
		String string = ""; // initialize String "string"
		String reverse = "";// Initialize String "reverse"
		
		Scanner scan = new Scanner(System.in); // create scanner object
		
		System.out.println("Please type a word or sentence:"); // Prompt the user / console
		
		string = scan.nextLine(); // Get input
		int length = string.length(); // Find the length of their string
		
		for (int i = length - 1; i >= 0; i--) { // Loop through each character, starting at the end.
			// charAt() starts at zero, so you have to subtract 1 from the length to get the correct result.
			reverse += string.charAt(i); // Add the result to the reverse string
		}
		
		System.out.println("Here is the reverse of what you typed:\n" + reverse); // Display results
	
		scan.close(); // Close the scanner object
	}

}