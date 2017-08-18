import java.util.Scanner; //Import scanner class

public class dataChange { // define a new class

	public static void main(String[] args) { // main method, used during initialization
		
		System.out.println("Type a sentence in lowercase:"); // ask the user for input via the console
		
		Scanner scan = new Scanner(System.in); // create new scanner object
		String sentence = scan.nextLine(); // set the sentence variable to the next line of user input
		scan.close(); //  close the scanner object
		
		sentence = sentence.toUpperCase(); // convert the user input string to upper case

		System.out.println("The sentence you typed is now being converted to uppercase:\n---\n" + sentence + "\n---\nDone!"); // display
				//results to the user
		
	}

}
