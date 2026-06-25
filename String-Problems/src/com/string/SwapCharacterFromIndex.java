package com.string;

public class SwapCharacterFromIndex {

	public static void main(String[] args) {
		
		String str = "Welcome To My Profile";
		int index1 = 0;
		int index2 = 14;
		
		str = str.trim();
		
		char[] ch = str.toCharArray();
		
		char temp = ch[index1];
		ch[index1] = ch[index2];
		ch[index2] = temp;
		
		String result = new String(ch);
		
		System.out.println(result);

	}

}
