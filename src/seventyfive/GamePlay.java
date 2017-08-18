package seventyfive;

import java.util.Scanner;

public class GamePlay {
	static String intro = "The Year is 3075, and you are in control of a future civilization.";
	static String nationName = "What would you like to call your nation?";
	static String districtNumber = "How many states would you like to create? (Between 1 and 5)";
	
	private static void prompt(String string) {
		System.out.println(string);
	}
	
	private static void cli(Scanner scanner){	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Nation nation = new Nation();
		
		prompt(intro);
		
		String command = scanner.nextLine();
		String[] commandArray = command.split(" ");
		for (int i = 0; i < commandArray.length; i++) {
			prompt(commandArray[i]);
		}
		switch (commandArray[0]) {
			case "list": list(nation);
			break;
			case "add":;
			break;
			case "destroy":;
			break;
			case "population":;
			break;
			case "name":;
		}
		
		//nation.name = ask(nationName,scanner);
		
	}
	
	void list(Nation nation) {
		
	}

}

/*
 * newcity name annapolis
 * annapolis population 200
 * annapolis destroy 
 */
