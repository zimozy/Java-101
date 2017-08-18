package test1;

public class Family {

	short size = 5; // Number of family members
	String location = "Switzerland"; // Where they live
	String dislikes = "Spinach"; // The whole family dislikes spinach
	
	class Mother {
		String dislikes = "Mushrooms";
		void bearChild() {} // Mother can bear children
	}
	
	public static void main(String[] args) {
		System.out.println("This family has " + size + " members.");
		System.out.println("They live in " + location);
		
	}
}
