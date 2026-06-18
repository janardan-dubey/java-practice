package com.string;

public class SortedDuplicates {

	public static void main(String[] args) {
		
		String str = "jaavxxtsppddz";
		
		str = str.toLowerCase();
		
		int[] count = new int[256];
		
		//count frequency
		for(int i=0; i<str.length(); i++)
		{
			count[str.charAt(i)]++;
		}
		
		String result ="";
		
		for(int j=0; j<count.length; j++)
		{
			if(count[j] > 1)
			{
				for(int i=0; i<count[j]; i++)
				{
					result += (char)j;
				}
			}
		}
		System.out.println(result);
	}

}
