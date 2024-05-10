package main;

import java.util.Random;
import java.util.Scanner;

public class Number_Guess {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int input, count = 0;

		int randomNumber = rand.nextInt(100);

		// here for range 0-100 ,100 is inserted in above line you can insert your own

		System.out.println("== Welcome to Number Guessing Game ==");

		System.out.println("Enter a number between 0 - 100");

		while (true) {

			input = sc.nextInt();
			count++;

			if (input == randomNumber) 
			{
				System.out.println("=== You Guessed correct number ===");
				System.out.println("== You took " + count + " attempt to guess number ==");
				break;
			} 
			else 
			{
				System.out.println("Try again");

				if (input < randomNumber) 
				{
					System.out.println("Random number is Greater");
				} 
				else 
				{
					System.out.println("Random number is Smaller");
				}
			}
		}
	}
}
