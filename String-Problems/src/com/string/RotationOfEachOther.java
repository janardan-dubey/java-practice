package com.string;

public class RotationOfEachOther {

	public static void main(String[] args) {

		String str = "abcd";
		String str1 = "cdab";

		String result = str + str;

		if (str.length() != str1.length()) {
			System.out.println("false");
			return;
		}

		if (result.contains(str1)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
