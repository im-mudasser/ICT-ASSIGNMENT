package com.assignment2;

public class Pattern {

	public static void pattern1() {
		int i = 0;
		int mutiple = 0;
		int row = 22;
		while (i < 6) {
			int j = 0;
			int k = 0;

			while (k < i) {
				System.out.print("//");
				k++;
			}
			int check = row - (2 * mutiple);

			while (j < check) {

				System.out.print("!");
				j++;
			}
			int l = check;
			while (l >= 0) {
				System.out.print("");
				l--;
			}
			int m = 0;
			while (m < i) {
				System.out.print("//");
				m++;
			}
			mutiple += 2;
			System.out.println("");
			i++;
		}
	}

	public static void pattern2(int n) {

		for (int i = 0; i < 2 * n - 1; i++) {
			int totalColInRow = 0;
			if (n > i) {

				totalColInRow = i + 1;
			}

			else {

				totalColInRow = 2 * n - i - 1;

			}

			for (int j = 0; j < totalColInRow; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}

	public static void pattern3(int n) {
		for (int i = 0; i < 2 * n - 1; i++) {
			int totalColInRow = 0;
			if (n > i) {

				totalColInRow = i + 1;
			}

			else {

				totalColInRow = 2 * n - i - 1;

			}
			int noOfSpace = n - totalColInRow;
			for (int spaces = 0; spaces < noOfSpace; spaces++) {
				System.out.print(" ");
			}

			for (int j = 0; j < totalColInRow; j++) {

				System.out.print("* ");
			}
			System.out.println();

		}
	}

	public static void pattern4(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < 1; j++) {
				System.out.print("#");
			}

			for (int spaces = 0; spaces < i; spaces++) {
				System.out.print(" ");
			}

			for (int k = 0; k < 1; k++) {
				System.out.print("#");
			}
			System.out.println();

		}
	}

	public static void pattern5(int n) {
		for (int i = 0; i < 2 * n; i++) {

			for (int spaces = 0; spaces < n - i; spaces++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print(i + 1);
			}
			System.out.println();

		}
	}

	public static void pattern6(int n) {
		int stars = 0;
		int spaces = 0;

		for (int i = 0; i < 2 * n; i++) {
			if (n > i) {

				stars = i + 1;
				spaces = 2 * (n - i) - 2;
			}

			else {

				stars = 2 * n - i;
				spaces = 2 * (i - n);

			}

			for (int j = 0; j < stars; j++) {
				System.out.print("*");

			}
			for (int k = 0; k < spaces; k++) {
				System.out.print(" ");
			}

			for (int l = 0; l < stars; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern7(int n) {
		// 1st half
		int outerSpaces = 0;
		int innerSpaces = 0;
		int stars = 0;
		for (int outer = 0; outer < 2; outer++) {
			for (int i = 0; i < n; i++) {

				outerSpaces = n - i;
				innerSpaces = i * 2;
				stars = 1;

				// outerspaces

				for (int j = 0; j < outerSpaces; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < stars; k++) {

					System.out.print("^");
				}
				// innerSpaces
				for (int m = 0; m < innerSpaces; m++) {
					System.out.print(" ");
				}
				for (int l = 0; l < stars; l++) {
					System.out.print("^");

				}

				System.out.println();

			}
		}
		System.out.println("+---------------------------+");
		// 2nd half
		for (int outer = 0; outer < 2; outer++) {
			for (int i = 0; i < n; i++) {
				outerSpaces = i;
				innerSpaces = 2 * (n - i) - 2;
				stars = 1;

				// outerspaces

				for (int j = 0; j < outerSpaces; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < stars; k++) {

					System.out.print("v");
				}
				// innerSpaces
				for (int m = 0; m < innerSpaces; m++) {
					System.out.print(" ");
				}
				for (int l = 0; l < stars; l++) {
					System.out.print("v");

				}

				System.out.println();

			}
		}
	}

	public static void pattern8(int n) {
		int outerspaces = 0;
		int innerStars = 0;
		int slashes = 0;
		int helper = 1;
		// 1st half
		for (int i = 0; i < 2 * n; i++) {
			if (n > i) {
				outerspaces = n - i;
				innerStars = 1;
				slashes = i;

			} else {
				outerspaces = (i - n) + 1;
				slashes = n - helper;
				innerStars = 1;
				helper++;

			}

			for (int j = 0; j < outerspaces; j++) {
				System.out.print(" ");

			}
			for (int k = 0; k < slashes; k++) {
				System.out.print("/");

			}
			for (int l = 0; l < innerStars; l++) {
				System.out.print("*");
			}
			for (int m = 0; m < slashes; m++) {
				System.out.print("/");
			}
			System.out.println();
		}
		System.out.println("+ - - - - - - - - - +");

		helper = 0;
		// 2nd half
		for (int i = 0; i < 2 * n; i++) {
			if (n > i) {
				outerspaces = (i + 1);
				slashes = n - i - 1;
				innerStars = 1;
			} else {
				outerspaces = n - helper;
				innerStars = 1;
				slashes = i - n;
				helper++;

			}

			for (int j = 0; j < outerspaces; j++) {
				System.out.print(" ");

			}
			for (int k = 0; k < slashes; k++) {
				System.out.print("/");

			}
			for (int l = 0; l < innerStars; l++) {
				System.out.print("*");
			}
			for (int m = 0; m < slashes; m++) {
				System.out.print("/");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern.pattern1();
		Pattern.pattern2(5);
		Pattern.pattern3(5);
		Pattern.pattern4(10);
		Pattern.pattern5(5);
		Pattern.pattern6(4);
		Pattern.pattern7(6);
		Pattern.pattern8(4);

	}

}
