//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			Random randomMaker = new Random();

			int randomNumber = randomMaker.nextInt(5);

			System.out.println(randomNumber);
			
			if (randomNumber == 0) {
				System.out.println("Your kinda ugly");
			}
			if (randomNumber == 1) {
				System.out.println("Your ugly");
			}
			if (randomNumber == 2) {
				System.out.println("Your pretty ugly");
			}
			if (randomNumber == 3) {
				System.out.println("Your really ugly");
			}
			if (randomNumber == 4) {
				System.out.println("Your super ugly");
			}
			
			// 1. Use each value of randomNumber to give the user a random compliment.

			// 2. Repeat all the code above 10 times

			// 3. Find someone to test out your program. They will like it :)
		}
	}
}
