//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
		String question = JOptionPane.showInputDialog("What question do you have for the 8-ball?");
		int number = 0;
		Random ran = new Random();
		number = ran.nextInt(4);
		if (number == 0) {
			System.out.println("Yes");
		}
		else if (number == 1) {
			System.out.println("No");
		}
		else if (number == 2) {
			System.out.println("Maybe you should ask google?");
		}
		else {
			System.out.println("Maybe");
		}
	}
	// 1. Make a main method that includes all the steps below

	// 2. Get the user to enter a question for the 8 ball to answer
	

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3

	
	// 4. If the random number is 0

	// -- tell the user "Yes"

	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer

}
