package com.string;

public class ReplaceDuplictes {

	public static void main(String[] args) {
		
		String str = "javatctb"; //output-> jJAVAvJAVAJAVAcJAVAb
		String str1 = "JAVA";
		
		int count[] = new int[256];
		
		//Count frequency
		for(int i=0; i<str.length(); i++)
		{
			count[str.charAt(i)]++;
		}
		
		String result = "";
		
		for(int j=0; j<str.length(); j++)
		{
			if(count[str.charAt(j)] == 1)
			{
				result += str.charAt(j);
			}
			if(count[str.charAt(j)] > 1)
			{
				result += str1;
			}
		}
		
		System.out.println(result);
	}

}
