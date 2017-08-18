
public class ReverseString {

	public static void main(String[] args) {
		String Text = "Madam, I'm Adam!";
		String Reverse = "";
		
		int TextLength = Text.length();
		
		for (int Position = TextLength; Position > 0; Position--) { /* Start at TextLength, then work backwards
		to zero */ 
			Reverse = Reverse + Text.charAt(Position);
			System.out.println(Text.charAt(Position - 1)); // Subtract 1, since the index begins at 0
		}
		
	}

}