import java.util.Scanner; // import scanner class

public class PassOrFail { // describe new class

	public static void main(String[] args) { // main function, runs at initializaiton
		String markString; // what the user will tell us
		int mark; // the actual mark integer
		Scanner scan = new Scanner(System.in); // create new scanner object
		
		System.out.println("Please enter your mark:"); // ask the user for input via the console
		
		markString = scan.nextLine(); // set user input to the markString
		scan.close(); // close scanner object
		mark = Integer.parseInt(markString); // convert user input to an integer
		
		if (mark >= 50) { // if the mark is 50 or higher
			System.out.println("PASS"); // say, "PASS"
		} else { // if the mark is below 50
			System.out.println("FAIL"); // say, "FAIL"
		}
		
		System.out.println("DONE"); // print "DONE" to the console

	}

}
