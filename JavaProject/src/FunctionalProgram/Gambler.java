package com.Function;
import java.util.Scanner;

import com.Utility.Utility;
public class Gambler
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter stake,goal");
		int stake = s1.nextInt();
		int goal = s1.nextInt();
		System.out.println("stake :"+stake+" goal :"+goal);
		System.out.println("Enter number of tries :");
		int tries = s1.nextInt();
		Utility.gambler(stake, goal, tries);
	}
	
	
}
