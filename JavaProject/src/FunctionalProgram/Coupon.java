package com.Function;

import java.util.Scanner;

import com.Utility.Utility;

public class Coupon 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the number");
		int N = s1.nextInt();
		System.out.println(N);
		int count=Utility.collect(N);
		
		System.out.println(count);
	}

}


