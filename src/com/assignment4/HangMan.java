package com.assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HangMan {

	public static void hangMan(int stages) {
		System.out.println("+-------------+");
		System.out.println("\t  |");
		if (stages >= 1) {
			System.out.print("\t  O\n");
		}
		if (stages >= 2) {
			System.out.print("\t/");
		}
		if (stages >= 3) {
			System.out.print(" |");

		}

		if (stages >= 4) {
			System.out.println(" \\");
		}
		if (stages >= 5) {
			System.out.print("\t/");

		}
		if (stages >= 6) {
			System.out.println("   \\");
		}
		System.out.print("\t\t|\n\t\t|\n\t\t|\n\t\t|\n");
		System.out.println("===================");

	}

	public static void main(String[] args) {
		List<String> listOfWords = new ArrayList<>() {
			{
				add("fast");
				add("programming");
				add("student");
				add("are");
				add("lazy");
				add("hangmen");
			}
		};
		Scanner keyboard = new Scanner(System.in);
		do {
			Random ran = new Random();
			int ranWord = ran.nextInt(listOfWords.size());
			String word = listOfWords.get(ranWord);

			int wrongCount = 0;
			List<Character> playerGuess = new ArrayList<Character>();
			printState(word, playerGuess);
			while (true) {
				hangMan(wrongCount);
				if (wrongCount == 6) {
					System.out.println("You lose");
					System.out.println("The word was : " + word);
					break;
				}

				if (!playerGuess(keyboard, playerGuess, word)) {
					wrongCount++;
				}
				if (printState(word, playerGuess)) {
					System.out.println("you Win!");
					break;
				}

			}
			System.out.println("do you want to play again type y/n");

		} while (keyboard.nextLine().equals("y"));

		System.out.println("Game over");

	}

	private static boolean playerGuess(Scanner keyboard, List<Character> playerGuess, String word) {

		System.out.println("Enter character that you can guess");
		String character = keyboard.nextLine();
		boolean containsChar = word.contains(character);
		if (character.length() >= 2) {
			System.out.println("Please enter one character at one time");
			containsChar = true;
		} else {
			playerGuess.add(character.charAt(0));
		}

		return containsChar;
	}

	private static boolean printState(String word, List<Character> playerGuess) {
		int correctCount = 0;
		for (int i = 0; i < word.length(); i++) {

			if (playerGuess.contains(word.charAt(i))) {
				System.out.print(word.charAt(i));
				correctCount++;

			} else {
				System.out.print("-");

			}

		}
		System.out.println();
		return (correctCount == word.length());
	}

}