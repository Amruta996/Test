
package com.Function;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

import com.Utility.Utility;

public class TwoDiArray
{

	public static void main(String[] args) throws IOException
	{
		int i;
		int j = 0;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter number of rows ");
		int r = s1.nextInt();
		System.out.println("Enter number of colomn ");
		int c = s1.nextInt();
		System.out.println("number of rows "+r+" number of colomns "+c);
		
		int arr[][] = new int[20][20];
		
		System.out.print("Enter " +(r*c)+ " Array Elements : ");
	       for(i=0; i<r; i++)
	       {
	           for(j=0; j<c; j++)
	           {
	               arr[i][j] = s1.nextInt();
	           }
	       }
		
		System.out.println("your elements : ");
		
		for(i=0;i<r;i++) 
		{
			for(j=0;j<c;j++) 
			{
				System.out.println(arr[i][j]);
			}
			System.out.println("\n");
		}
		
		Utility.twodiArray(arr, r, c);
	}
}
