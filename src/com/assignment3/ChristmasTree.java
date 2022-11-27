package com.assignment3;

public class ChristmasTree {
	public static void christmasTree(int segment, int height) {

		for (int i = 0; i < segment; i++) {
			int spacestoBePrinted = height * segment;
			for (int j = 0; j < height; j++) {

				for (int space = 0; space < spacestoBePrinted; space++)

				{
					System.out.print(" ");

				}
				spacestoBePrinted--;
				for (int star = 0; star < 2 * j + 1 + i * 2; star++) {
					System.out.print("*");

				}
				System.out.println();
			}
		}

		// for root of a tree

		int rootSpace = segment * height + segment - 1;
		int starsToBePrinted = 1;
		for (int i = 0; i < 3; i++) {
			if (i == 2) {
				rootSpace = height * segment + (segment - height) + 1;
				starsToBePrinted = segment + height;

			}
			for (int space = 0; space < rootSpace; space++) {
				System.out.print(" ");
			}
			for (int star = 0; star < starsToBePrinted; star++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		ChristmasTree.christmasTree(2, 10);

	}

}
