package nc;

public class Main {

	public static void main(String[] args) { // We use the main() function to run our code
		BigCity raleigh = new BigCity("Raleigh", "403,892"); // Create a BigCity ojbect called Raleigh
		BigRaceCity charlotte = new BigRaceCity("Charlotte", "731,424"); // Create another called Charlotte
		Town lewisville = new Town("Lewisville", "12,639"); // Create a town object called Lewisville
		
		System.out.println("Raleigh population:\n" // Output the populations of Raliegh and Lewisville
				+ raleigh.population
				+ "\nLewisville population:\n"
				+ lewisville.population);
		
		raleigh.parade(); // Try the parade() method on each of the three objects
		charlotte.parade(); // Charlotte's parade() method is different (it outputs a second line of text) because we used method 
		// overriding to change it
		lewisville.parade();
		
		raleigh.vote("Democrat"); // Run an "election" using the vote() method of each object
		charlotte.vote("Republican");
		lewisville.vote("Republican");
	}

}
