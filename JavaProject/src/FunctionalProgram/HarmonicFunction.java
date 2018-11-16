package com.Function;

import java.util.Scanner;

import com.Utility.Utility;
public class HarmonicFunction 
{

	public static void main(String[] args) 
	{
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the number");
		int num = s1.nextInt();
		Utility.harmonic(num);
		
	}

}


