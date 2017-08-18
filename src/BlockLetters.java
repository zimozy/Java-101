public class BlockLetters { // create BlockLetters class

	public static void main(String[] args) { // main function, as usual
		
		String[] T = new String[] {"TTTTTTTTTT","    TT    ","    TT    ","    TT    ","    TT    "}; // These 5 strings make the letter "T"
		String[] R = new String[] {"RRRRRR    ","RR   RR   ","RRRRRR    ","RR   RR   ","RR    RR  "}; // Letter "R"
		String[] H = new String[] {"HH   HH   ","HH   HH   ","HHHHHHH   ","HH   HH   ","HH   HH   "}; // Letter "H"

		String[] initials = new String[T.length]; // Makes new array for the three letters to go in to. Has 5 items, like the length of the T array
		
		for (int i = 0 ; i < initials.length ; i++) // loop 5 times
		    initials[i] = T[i] + " " + R[i] + " " + H[i]; // get the corresponding part of each letter's array
		// Now each initials[] item is a longer string, that makes up one row of the whole picture

		for (String s : initials) // loop through each item in the initials[] array
		    System.out.println(s); // output the line to the console

	}

}