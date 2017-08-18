/*
 * This is an example of compile-time polymorphism. Here, one object will have two methods that have
 * the same name. This way, we can give the same apparent function a different number of parameters (in
 * our case, two and then three) and the code will run just fine.
 * 
 * Our example is a calculator, which can multiply either two or three numbers. We'll print the result.
 */

package test1; // Package I made for this Test

class Calc { // Calculator class
	public int multiply(int num1, int num2) { // This method takes two integers
		int result = num1 * num2; // Multiply the input
		return result; // Return the result
	}

	public int multiply(int num1, int num2, int num3) { // This method  of the same name takes
		// three integers
		int result = num1 * num2 * num3; // Multiply the input 
		return result; // Return the result
	}
}

public class overloading { // Let's try it out now
	public static void main(String[] args) {
		Calc Brainz = new Calc(); // Create instance of the Calc class
		
		System.out.println( Brainz.multiply(2,5) ); // Give the multiply() function two parameters
		System.out.println( Brainz.multiply(5,5,5) ); // Now give it three parameters
	}
}
