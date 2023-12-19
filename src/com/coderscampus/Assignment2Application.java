package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// String userInput = collectInput(scanner, "Pick a number between 1 and 100 ");
		// changed to scanner

		// int convertedInput = Integer.parseInt(userInput);
		Random random = new Random();
		int randomNumber = random.nextInt(101);
		System.out.println(randomNumber);
		System.out.println("Please pick a number between 1 and 100");
		// int convertedInput = scanner.nextInt();

		// INSERT WHILE LOOP INSTEAD OF FOR LOOP

		int userGuess = 0;

		while (userGuess < 5) {
			int convertedInput = scanner.nextInt();

			if (convertedInput < 1 || convertedInput > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				continue;

			}
			userGuess++;
			// for (int i = 0; i < 4; i++) {

			if (convertedInput == randomNumber) {

				System.out.println("You win!");
				return;

			} else if (convertedInput < randomNumber) {
				System.out.println("Please pick a higher number");
			} else {

				System.out.println("Please pick a lower number");
			}

		}

		System.out.println("You lose, the number to guess was: " + randomNumber);

	}
}
//convertedInput = scanner.nextInt();