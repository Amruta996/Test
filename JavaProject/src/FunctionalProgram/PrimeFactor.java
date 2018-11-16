package com.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Utility.Utility;

public class PrimeFactor
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s1.nextInt();
		Utility.primeFactor(n);
	}
	
}
