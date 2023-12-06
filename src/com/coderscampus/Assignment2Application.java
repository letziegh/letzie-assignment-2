package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//collect a random number
		//generate random number between 1 and 100
		//dont show random number to user
		//ask user to pick a number between 1 and 100
		//collect user input
	//etc...
		
		
		//first prompt user to pick a number
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick a number between 1 and 100 ");
		String userInput = scanner.nextLine();
		Integer convertedInput = Integer.parseInt(userInput);
		
		Random random = new Random();
		
		for(int i = 1; i<101; i++) {
			System.out.println(random.nextInt(101));
		}
		if(convertedInput <=100 && (convertedInput >=1)) {
			System.out.println("You win!");
		}else if(convertedInput) {
				System.out.println();
			}
			
			
		}
		
		scanner.close();
		
	}

}
