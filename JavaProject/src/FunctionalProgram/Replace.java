package com.Function;
import java.util.Scanner;

import com.Utility.Utility;

//Assignment1
public class Replace 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the  name ");
		String st1= s1.next();
		Utility.Replace(st1);
	
	}
}
