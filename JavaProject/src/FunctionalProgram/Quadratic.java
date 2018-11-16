package com.Function;

import java.util.Scanner;

import com.Utility.Utility;

public class Quadratic
{

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a , b & c");
		int a = s1.nextInt();
		int b = s1.nextInt();
		int c = s1.nextInt();
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		
		Utility.quadraticEqu(a, b, c);
	}
}
