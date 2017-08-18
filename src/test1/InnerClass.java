package test1;

class Family {
	short size = 5; // Number of family members
	String location = "Switzerland"; // Where they live
	String dislikes = "Spinach"; // The whole family dislikes spinach
	
	class Mother {
		String dislikes = "Mushrooms";
		void bearChild() {} // Mother can bear children
	}
	
}

class InnerClass {
	public static void main(String[] args) {
		Family Johnsons = new Family();
		
		System.out.println("This family has " + size + " members.");
		System.out.println("They live in " + location);
		
	}
}