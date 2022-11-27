package com.assignment2;

public class SeriesOfCheer {
	public static void seriesOfCheer(int lines, int cheer) {

		for (int i = 0; i < lines; i++) {
			for (int spaces = 0; spaces < i * 2; spaces++) {
				System.out.print(" ");
			}
			for (int j = 0; j < cheer; j++) {
				if (j == 0) {
					System.out.print(" Go ");
				} else {
					System.out.print(" Buddy Go ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		seriesOfCheer(4, 2);

	}

}
