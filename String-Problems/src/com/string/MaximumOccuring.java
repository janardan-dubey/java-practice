package com.string;

public class MaximumOccuring {

	public static void main(String[] args) {

		String str = "Janardan";
		

		if (str == null || str.isEmpty())
			System.out.println("Invalid input");

		str = str.toLowerCase();
		char[] ch = str.toCharArray();

		int max = 0;
		char maxChar = ' ';

		for (int i = 0; i < ch.length; i++) {
			boolean flag = true;
			int count = 0;

			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j])
					count++;

				if (ch[i] == ch[j] && i > j)
					flag = false;

			}

			if (flag) {
				System.out.println(ch[i] + "=" + count);

				if (count > max) {
					max = count;
					maxChar = ch[i];
				}
			}
		}

		System.out.println("Maximum occuring character is: " + maxChar + ":" + max);
	}

}
