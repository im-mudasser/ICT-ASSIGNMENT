package com.assignment2;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	public static void guessNumberGame() {
		Scanner in = new Scanner(System.in);
		String playAgain = "";
		do {
			Random ran = new Random();
			int randomNumber = ran.nextInt(100);
			int userTry = 3;
			while (userTry != 0) {
				System.out.println("you will have " + userTry + " turns");
				System.out.println("Pick any number between 1 - 100 ");
				int userguessNumber = in.nextInt();
				if (randomNumber == userguessNumber) {
					System.out.println("you win !!!!!!!!!!!!");
					break;
				}

				else if (userguessNumber > randomNumber) {
					System.out.println("Your guess " + userguessNumber + " is  high");
				} else if (userguessNumber < randomNumber) {
					System.out.println("Your guess  " + userguessNumber + " is  low");
				}
				userTry--;
			}
			if (userTry == 0) {
				System.out.println("you loss!!");
			}
			System.out.println("do you wan to play again");
			playAgain = in.next();

		} while (playAgain.equals("yes"));
		in.close();
	}

	public static void main(String[] args) {
		guessNumberGame();

	}

}
