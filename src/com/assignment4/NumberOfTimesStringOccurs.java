package com.assignment4;

public class NumberOfTimesStringOccurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "azcbobobegghaklbobobobobobobob";
		String str = "bob";
		int count = 0;
		int endStr = str.length();
		for (int startStr = 0; startStr < text.length(); startStr++) {
			if (str.equals(text.substring(startStr, endStr))) {
				count++;
			}

			if (endStr == text.length()) {
				break;
			}
			endStr++;

		}
		System.out.println(str + " occurs " + count + " Times");
	}

}
