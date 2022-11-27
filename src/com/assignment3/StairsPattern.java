package com.assignment3;

public class StairsPattern {
	public static void stairs(int n) {

		for (int i = 0; i < n; i++) {

			int innerSpaces = 3 * i + 1;
			int outerSpaces = 3 * (n - i);
			int starToBePrinted = n + 1;
			for (int j = 0; j < 3; j++) {

				if (j == 1 || j == 2) {
					innerSpaces = (3 * i) + n + 1;
					starToBePrinted = 1;
				}

				for (int space = 0; space < outerSpaces; space++) {
					System.out.print(" ");
				}

				for (int star = 0; star < starToBePrinted; star++) {
					System.out.print("*");
				}
				for (int space = 0; space < innerSpaces; space++) {
					System.out.print(" ");

				}
				System.out.print("*");
				System.out.println();

			}

		}

		for (int starFromEnd = 0; starFromEnd < n * 6; starFromEnd++) {
			System.out.print("*");
		}
	}

	public static void main(String[] args) {
		StairsPattern.stairs(11);

	}

}
