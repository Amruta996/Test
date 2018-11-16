package com.Algorithm;
import java.util.Scanner;

import com.Function.*;
import com.Utility.Utility;

public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter 1 st String");
		String f1 = s1.next();
		System.out.println("Enter 2 nd String");
		String f2 = s1.next();
		Utility.Anagram(f1,f2);
	}
}
