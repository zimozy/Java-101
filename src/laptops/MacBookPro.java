package laptops; // Part of the laptops package

public class MacBookPro
	extends Laptop
	implements Accelerated {
	// This class inherits from the abstract class Laptop and must implement the Accelerated interface
	double cpu = 3.0;
	short ram = 16;
	String material = "Aluminum";

	public static void accelerate() { // If we don't define this method (required in the Accelerated interface)
		// then we will get an error
		System.out.println("This computer has graphics acceleration."); // Simple function for illustration
	}
	
	public static void main(String[] args) { // Method invoked on execution
		accelerate();
	}
}
