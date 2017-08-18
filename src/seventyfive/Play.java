package seventyfive;

import java.util.Scanner;

import seventyfive.Nation;
import seventyfive.District;
import seventyfive.City;

public class Play {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Nation nation = new Nation();
		
		while (true) {
			String command = scanner.nextLine();
			String commandArray[] = command.split(" ");
			switch(commandArray[0]) {
			case "add": 
				
				System.out.println("Added new thing.");
				break;
			case "list": 
				System.out.println("Listing . . .");
				break;
			default:
				System.out.println("Did not recognize command. Try again.");
			}
		}
	}

}
