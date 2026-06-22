package com.string;

public class IsPanagram {

	public static void main(String[] args) {
		
		String str = "The quick brown fox jumps over the lazy dog";
		
		str = str.toLowerCase();
		
		int[] arr = new int[26];
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z')
			{
				arr[ch -'a']++;
			}
		}
		
		boolean flag = true;
		
		for(int i=0; i<26; i++)
		{
			if(arr[i] == 0)
			{
				flag = false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("Panagram");
		}
		else
		{
			System.out.println("Not a Panagram");
		}
	}

}
