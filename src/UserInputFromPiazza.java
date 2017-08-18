import java.util.Scanner; // Import Scanner class

public class UserInputFromPiazza { // create UserInputFromPiazza class
	
	public static void main(String[] args) { // the main() method, used when initialized

		Scanner in = new Scanner(System.in); // create net Scanner object called "in"
		System.out.print("What color do you like, Red, Blue, or Yellow?"); // prompt user (using console) about what to do

		String color = in.nextLine(); // create String "color" with user input
		in.close(); // Close the scanner off
		
		System.out.println("The color you chose is " + color); // Print out information
	
	}
	
}