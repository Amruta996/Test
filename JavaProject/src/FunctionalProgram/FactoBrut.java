package com.Function;
import java.util.Scanner;
public class FactoBrut 
{
	public static void main(String[] args)
	{
		
		int i;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s1.nextInt();
		
		 for(i = 2; i<= num; i++)
		 {
	         while(num%i == 0) 
	         {
	            System.out.println(i+" ");
	            num = num/i;
	         }
	         System.out.println(num);
		 }
		 
	}

}
