package com.string;

public class StringsRotationOfEachOther {

	public static void main(String[] args) {
		
		String str = "xyz";
		String str1 = "zyx";
		
		String result = str + str;
		
		
		boolean flag;
		
		if(result.contains(str1))
		{
			flag = true;
		}
		else
			flag = false;
		
		IO.println(flag);
		
		
	}

}
