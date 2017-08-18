/*
 * This is an example of an inner class. Here, we create a Bank class, containing an inner Vault class. The 
 * Vault class is private, so other classes won't be able to see how much money is stored in the bank.
 * However, the Bank class is able to access this information and check whether the vault is full.
 * This is an example of encapsulation, and how it can improve our code.
 */

package test1;

public class Bank { // Bank class
	public static void checkVault() { // Check whether the vault has money in it.
		Vault ourVault = new Vault(); // Create new vault object
		String message = (ourVault.total == 0 ) ? "The vault is empty!" : "The vault still has money.";
		// Check whether the vault is empty
		System.out.println(message); // Tell the user the message
	}
	
	private static class Vault { // The vault is private, so it is not visible to other classes
		int total = 50000; // The vault contains $50,000
	}

	public static void main(String[] args) {
		checkVault();
	}
}

