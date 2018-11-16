package com.Function;
import java.util.Scanner;

import com.Utility.Utility;
public class MathFunction 
{
	//By using cmd line argument
	public static void main(String[] args)
	{
		System.out.println("By cmd ");
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		System.out.println("X-axis :"+x);
		System.out.println("Y-axis :"+y);
		Utility.mathFunction(x,y);	
	}

}
