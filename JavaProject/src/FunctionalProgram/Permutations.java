package com.Function;
import java.util.Scanner;

import com.Utility.Utility;

public class Permutations
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s1.next();
		int length =str.length();
		Utility.StringPermute(str, 0,length-1);
	}
}

