/* 
 * Inheritance means that one class automatically has the methods and variables of its "parent" class.
 * Here, a Son class extends the Dad class, which means that it will automatically have the variables of
 * the Dad class. Specifically, we don't have to say that the son went to high school--after all, since
 * the Dad did, the Son object inherits that property implicitly. 
 */

package test1; // Package for this IBG test

class Dad { // Dad went to high school, but not college
	boolean highSchool = true;
	boolean college = false;
}

class Son extends Dad { // Son also went to high school, but that variable is inherited 
	boolean college = true; // We only specify that the son went to college, since his Dad has a different
	// value for that variable
}

public class Inheritance { // Let's try it out!	
	public static void main(String[] args) {
		Dad David = new Dad(); // Create Dad "David, and Son "Ben"
		Son Ben = new Son();
		String result = new String(); // This is what we will output at the end
		
		// Check whether the two have gone to high school and college
		if (David.highSchool) {result += "Dad went to high school.\n";} 
		if (David.college) {result += "Dad also went to college.\n";}		
		if (Ben.highSchool) {result += "Son went to high school.\n";}
		if (Ben.college) {result += "Son also went to college.";}
		
		System.out.println(result); // Print the results
	}
}