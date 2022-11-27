package com.assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieRecommendation {
	final static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> ratingList = new ArrayList<ArrayList<Integer>>();
		setValues(in, ratingList);
		mostRatedMovies(ratingList);
		mostratingsByReviewer(ratingList);
		System.out.println("Enter the movie number to find rating against");
		int findRating = in.nextInt();
		findMovieRating(ratingList, findRating);
		addNewReviewer(ratingList);

		System.out.println("Enter Scthe rating");
		int rating = in.nextInt();
		System.out.println("Enter the movie");
		int movie = in.nextInt();
		System.out.println("Enter the reviewer");
		int reviewer = in.nextInt();
		addReviewerRating(ratingList, rating, movie, reviewer);
		in.close();

	}

	private static void addReviewerRating(ArrayList<ArrayList<Integer>> ratingList, int rating, int movie,
			int reviewer) {
		System.out.println(ratingList.get(reviewer).size());
		ratingList.get(reviewer).add(movie, rating);
		System.out.println(movie + "movie reviews add successfully!");
		System.out.println(ratingList);

	}

	private static void addNewReviewer(ArrayList<ArrayList<Integer>> ratingList) {

		System.out.println("How many add new reviewer you should enter ");
		int newReview = in.nextInt();

		for (int i = 0; i < newReview; i++) {
			ratingList.add(new ArrayList<Integer>());
		}
		System.out.println(newReview + "revieweris added sucessfully!!");

	}

	private static void findMovieRating(ArrayList<ArrayList<Integer>> ratingList, int findRating) {

		// movie 0 1 2 3;

		for (int i = 0; i < ratingList.size(); i++) {
			System.out.println("rating given to the movie " + findRating + "is" + ratingList.get(i).get(findRating));
		}
	}

	private static void mostratingsByReviewer(ArrayList<ArrayList<Integer>> ratingList) {
		int max = -1;
		System.out.println("rating list size " + ratingList.size());
		ArrayList<Integer> maxValue = new ArrayList<>();

		for (int i = 0; i < ratingList.size(); i++) {
			for (int j = 0; j < ratingList.get(i).size(); j++) {

				if (ratingList.get(i).get(j) >= max) {
					max = ratingList.get(i).get(j);

				}

			}
			maxValue.add(max);
			System.out.println("max value array " + maxValue);

		}

		for (int i = 0; i < maxValue.size(); i++) {

			if (max != maxValue.get(i)) {
				maxValue.remove(i);

			}
		}

		// search from 2darray
		int findIndex = -1;
		ArrayList<Integer> listofIndex = new ArrayList<Integer>();
		for (int i = 0; i < maxValue.size(); i++) {
			findIndex = maxValue.get(i);
			for (int j = 0; j < ratingList.size(); j++) {
				for (int k = 0; k < ratingList.get(j).size(); k++) {
					if (ratingList.get(j).get(k) == findIndex) {
						if (!listofIndex.contains(j)) {
							listofIndex.add(j);
							break;
						}
					}

				}

			}

		}
		System.out.println("The reviewer that has given the max number of ratings." + listofIndex);
	}

	private static void setValues(Scanner in, ArrayList<ArrayList<Integer>> ratingList) {
		int addvalue = 0;
		System.out.println("Enter the rows");
		int row = in.nextInt();
		System.out.println("Ente the number of cols");
		int col = in.nextInt();
		System.out.println("Enter values in " + row + "x" + col);
		for (int i = 0; i < row; i++) {
			ratingList.add(new ArrayList<Integer>());
			for (int j = 0; j < col; j++) {
				addvalue = in.nextInt();

				ratingList.get(i).add(j, addvalue);
			}
		}

	}

	private static void mostRatedMovies(ArrayList<ArrayList<Integer>> ratingList) {
		int max = -1;
		int index = -1;
		for (int i = 0; i < ratingList.size(); i++) {
			for (int j = 0; j < ratingList.get(i).size(); j++) {

				if (ratingList.get(i).get(j) > max) {

					max = ratingList.get(i).get(j);
					index = j;
				}

			}
		}
		System.out.println("move rated movie is " + index + " with rating " + max);
	}

}
