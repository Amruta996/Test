package com.Function;

import java.util.Scanner;

import com.Utility.Utility;

public class LeapYear 
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the year");
		int num = s1.nextInt();
		Utility.leapYear(num);
	}
	
}
