//day3
package com.Function;

import java.util.Scanner;

import com.Utility.Utility;

public class Triplate 
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length = s1.nextInt();
		int ar[]=new int[length];
		System.out.println("Enter the elements");
		
		for(int i=0;i<length;i++) 
		{
			ar[i]=s1.nextInt();
		}
		Utility.findTriplate(ar,length);
	}
}
	
	
	
	
