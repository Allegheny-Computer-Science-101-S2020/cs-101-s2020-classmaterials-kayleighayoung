/*
This work is mine unless otherwise stated - Kayleigh Young
*/
import java.util.Scanner;

public class PostmanApp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Postman App program ....");
		System.out.println("-------------------------------------");

		System.out.println("What is the starting house number on your list of delivery?");
		int start = scan.nextInt();
		System.out.println("What is the last house number on your list of delivery?");
		int end = scan.nextInt();

		while(true){
			System.out.println("What house number that you are looking for?");
			int look;
			while (!scan.hasNextInt()) {
				System.out.println("Please enter a number.");
				scan.next();
			}
			look = scan.nextInt();

			if (look >= start && look <= end) {
				if (look % 2 == 0) {
					System.out.println("That house will be on your right!");
				} else {
					System.out.println("That house will be on your left!");
				}

			} else {
				System.out.println("We can't find that house number, please try again!");
					}

			System.out.println("Do you want to continue y or n");
	    String input = scan.next();

	   	if (input.equalsIgnoreCase("n")) {
	      break;

				}

			}

		}

	}
