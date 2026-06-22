package com.string;

public class StringReverseSamePosition {

	public static void main(String[] args) {

		String str = "Java is a language";
		str = str.trim();
		String[] arr = str.split("\\s+");

		// ========================Reverse at same position====================================
		for (String s : arr) {
			String rev = "";

			for (int i = s.length() - 1; i >= 0; i--) {
				rev += s.charAt(i);
			}
			System.out.print(rev + " ");
		}

		// ========================Reverse Whole String====================================
		String reverse = "";

		for (int i = arr.length - 1; i >= 0; i--) {
			reverse += arr[i] + " ";
		}
		System.out.println(" ");
		System.out.print(reverse);

		// ========================Reverse character of reversed String====================================
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(" ");
		System.out.print(rev);
	}

}
