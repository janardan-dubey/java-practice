package com.string;

import java.util.Scanner;

public class SwapFirstAndLastCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		String tempo = str;

//		===================================Without Using Loop====================================
		if (str == null || str.isEmpty()) {
			System.out.println("String is empty");
			return;
		}

		str = str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);

		System.out.println(str);

//		===================================With Loop====================================

		char[] arr = tempo.toCharArray();

		char temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;

		String result = new String(arr);

		System.out.println(result);
	}

}
