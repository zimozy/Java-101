/*
 * This class demonstrates the use of for and while loops, and if statements.
 * We will cycle through all the integers, using an if statement to see whether they
 * are Fibonnaci numbers. A Fibonacci number is equal to the sum of the previous two
 * numbers in the Fibonacci sequence:
 * 1 1 2 3 5 8 13 and so on...
 * I made a change here .......
 */

public class forifwhile {

	public static void main(String[] args) {
		int fibs[]; // Holds our Fibonacci numbers
		int placeHolder; // This is a placeHolderholder for the most recently discovered Fibonacci number
		int max; // max number of fibbonaci numbers calculated before stopping
		int counter; // this will have the value of every integer until we stop

		counter = 0; // start at zero
		max = 10; // max number of Fibonacci numbers calculated

		fibs = new int[max]; // Fibonacci array

		fibs[0] = 1; // we set up the first two items in the sequence to get things going
		fibs[1] = 1;
		placeHolder = 2; // the placeHolderholder starts at 2 because we have already set the first two values

		/* WHILE loop */
		while (placeHolder < max) { //loop until we reach our maximum limit
			/* IF statement */
			if (counter == fibs[placeHolder - 1] + fibs[placeHolder - 2]) { // If the counter is a Fib number
				System.out.println("  Found a Fibonacci number! " + counter); // Tell the user
				fibs[placeHolder] = counter; // add the counter value to the array of Fib numbers
				placeHolder++; // advance the placeHolder holder
			}
			counter++; // advance the counter
		}

		/* FOR loop */
		System.out.println("The first five Fibonacci numbers are:");
		for (int i = 0; i < 5; i++) { // Let's loop five times
			System.out.println(fibs[i]); // State the Fib number at fibs[i]
		}
	}
}
