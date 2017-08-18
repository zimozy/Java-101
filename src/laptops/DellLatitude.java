package laptops;

public class DellLatitude extends Laptop { // This class extends our Laptop abstract class, but does not
	// implement the Accelerated interface, and therefore does not require the Accelerate()
	// method required when using that interface
	double cpu = 2.0;
	short ram = 4;
	String material = "Plastic";
	
	public static void main(String[] args) {
		System.out.println("This is a Dell Latitude");
	}
}
