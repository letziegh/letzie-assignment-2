package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);

		String userInput = collectInput(scanner, "Pick a number between 1 and 100 ");

		int convertedInput = Integer.parseInt(userInput);

		Random random = new Random();
		int randomNumber = random.nextInt(101);
		for (int i= 1; i<5; i++) {
			
			Scanner scan = new Scanner(System.in);
		if (convertedInput == randomNumber) {
			
							System.out.println("You win!");
						} else if (convertedInput < randomNumber) {
							System.out.println("Please pick a higher number");
						} else if (convertedInput > randomNumber) {
							System.out.println("Please pick a lower number");
			
						}
						System.out.println("You lose, the number to guess was " + randomNumber);
					}
	}

		
	

	private static String collectInput(Scanner scanner, String messageInConsole) {
		System.out.println(messageInConsole);
		String userInput = scanner.nextLine();
		return userInput;

//		for (int i = 1; i < 5; i++) {
			// System.out.println(randomNumber);
//	System.out.println("You lose, the number to guess was " + randomNumber);

//LOOP IF STATEMENT 5 TIMES THEN END PROGRAM////

//			if (convertedInput == randomNumber) {
//
//				System.out.println("You win!");
//			} else if (convertedInput < randomNumber) {
//				System.out.println("Please pick a higher number");
//			} else if (convertedInput > randomNumber) {
//				System.out.println("Please pick a lower number");
//
//			}
//			System.out.println("You lose, the number to guess was " + randomNumber);
//		}
	}

}
