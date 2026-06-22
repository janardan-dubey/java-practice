package com.string;

public class IsAnagram {

	public static void main(String[] args) {
		
		String str = "spar";
		String str1 = "raasp";
		
		if(str.length() != str1.length())
		{
			System.out.println("Not an Anagram");
			return;
		}
		
		int[] arr = new int[26];
		
		for(int i=0; i<str.length(); i++)
		{
			arr[str.charAt(i) - 'a']++;
			arr[str1.charAt(i) - 'a']--;
		}
		
		boolean flag = true;
		
		for(int i=0; i<26; i++)
		{
			if(arr[i] != 0)
			{
				flag = false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
	}

}
