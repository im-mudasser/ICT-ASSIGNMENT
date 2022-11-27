package com.assignment3;

public class SongLyrics {
	public static void verse1() {
		System.out.println("I don't know why she swallowed that fly,\r\n" + "Perhaps she'll die.");
	}

	public static void verse2() {
		System.out.println("She swallowed the spider to catch the fly,");
	}

	public static void verse3() {
		System.out.println("She swallowed the bird to catch the spider,");

	}

	public static void verse4() {
		System.out.println("She swallowed the cat to catch the bird,");
	}

	public static void song() {
		System.out.println("There was an old lady who swallowed a fly.");
		verse1();
		System.out.println();
		System.out.println("There was an old lady who swallowed a spider,\r\n"
				+ "That wriggled and iggled and jiggled inside her.");
		verse2();
		verse1();
		System.out.println();
		System.out.println("There was an old lady who swallowed a bird,\r\n" + "How absurd to swallow a bird.");
		verse3();
		verse2();
		verse1();
		System.out.println();
		System.out.println("There was an old lady who swallowed a cat,\r\n" + "Imagine that to swallow a cat.");
		verse4();
		verse3();
		verse2();
		verse1();
		System.out.println();
		System.out.println("There was an old lady who swallowed a dog,\r\n" + "What a hog to swallow a dog.\r\n"
				+ "She swallowed the dog to catch the cat,");
		verse4();
		verse3();
		verse2();
		verse1();
		System.out.println();
		System.out.println("There was an old lady who\r\n" + "swallowed a horse, She died of\r\n" + "course.");

	}

	public static void main(String[] args) {
		SongLyrics.song();
	}
}
