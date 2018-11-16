package com.Function;
import java.util.Scanner;

import com.Utility.Utility;
//Assignment2
public class Random
{
	public static void main(String[] args)
	{
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number of times to Flip Coin");
		int num = s1.nextInt();
		Utility.RandomFunction(num);
		
		
	}
	

}