package com.string;

public class RemoveCharacterIfPresentInSecond {

	public static void main(String[] args) {
		
		String str = "India is greate";
		String str1 = "In";
		
		str = str.trim().toLowerCase();
		str1 = str1.toLowerCase();
		
		String result = "";
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			boolean found = true;
			
			for(int j=0; j<str1.length(); j++)
			{
				if(ch == str1.charAt(j))
				{
					found = false;
					break;
				}
				
			}
			
			if(found)
			{
				result += ch;
			}
		}
		
		System.out.println(result);
		

	}

}


//OUTPUT-> da s greate
