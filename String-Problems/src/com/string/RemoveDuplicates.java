package com.string;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str = "Jaavaatccx";
		
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			int count = 0;
			
			for(int j=0; j<ch.length; j++)
			{
		
				if(ch[i] == ch[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(ch[i]);
			}
		}
		

	}

}
