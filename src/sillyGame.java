import java.util.Random;
import java.util.Scanner;

public class sillyGame {
	private static String msgWelcome = "Welcome!\nBefore we begin, do you want to play the looping version? (Answer y or n):";
	private static String msgSecret = "Ok, great. Now, do you want me to generate a random number? (Answer y or n):";
	private static String msgBegin = "Allllrighty, then! Let's begin.\n"
			+ "I've got a number between 1 and 10 -- can you guess it?\n"
			+ "Your guess:";
	private static String msgTryAgain = "That's incorrect. Try again:";
	private static String msgLost = "That's incorrect. You lost!";
	private static String msgWon = "That's correct. You won!";
	private static Scanner scan = new Scanner(System.in);
	private static int nonrandom = 4;
	
	public static void main(String[] args) {
		prompt(msgWelcome);
		boolean loop = (scan.nextLine().equals("y")) ? true : false;
		
		prompt(msgSecret);
		int secret = (scan.nextLine().equals("y")) ? 0 : nonrandom;
		
		prompt(msgBegin);
		
		play(loop,secret); // Whether to loop, and makes a random number if no secret value supplied

		scan.close();
	}
	
	private static void prompt(String text) {
		System.out.println(text);
	}
	
	private static void play(boolean loop, int secret) {
		if (secret == 0) {
			Random generator = new Random();
			secret = generator.nextInt(9) + 1; 
		}
		
		do {
			String guessString = scan.nextLine();
			int guess = Integer.parseInt(guessString);
			
			if (guess != secret) { // If they're wrong
				if (loop) { // ...and if we're playing the looping version
					prompt(msgTryAgain);
				} else { // If the game is not looping
					prompt(msgLost);
				}
			} else { // If they got it right
				prompt(msgWon);
				loop = false;
			}				
		} while (loop); // do...while loop for the game

	}
}
