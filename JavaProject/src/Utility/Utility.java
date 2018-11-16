package com.Utility;
import com.Algorithm.*;


import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Utility
{
//************************************************************************************
//Assignment:1
//User Input and Replace String Template “Hello <<UserName>>, How are you?” 
//I/P -> Take User Name as Input. Ensure UserName has min 3 char
//Logic -> Replace <<UserName>> with the proper name
//O/P -> Print the String with User Name

	public static void Replace(String st1) 
	{
		String st2= "Amruta Pandit";
		String st3 =st1.replaceAll(st1, st2);
		System.out.println("hello "+st1+" how are you ?");
		System.out.println("hello "+st3+" how are you ?");
	}

//************************************************************************************
//Assignment:2
//Flip Coin and print percentage of Heads and Tails
//I/P -> The number of times to Flip Coin. Ensure it is positive integer.
//Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
//O/P -> Percentage of Head vs Tails
	
	public static void RandomFunction(int num) 
	{

		int i;
		int j;
		int head=0;
		int tail=0;
		float percentage;
		float percentage1;
			//double random = Math.random();
		double a[] = new double[num];
		for(j=0;j<a.length;j++) 
		{
			a[j]=Math.random();
		}
		for(j=0;j<a.length;j++) 
		{
			System.out.println("Random at "+(j+1)+" : "+a[j]);
		}
		System.out.println("\n");
		for(j=0;j<a.length;j++) 
		{
			if(a[j]>0.5) 
			{
				System.out.println("position at "+(j+1)+" head");
				head++;
			}
			else 
			{
				System.out.println("position at "+(j+1)+" tail");
				tail++;
			}
		}
			
		System.out.println("head :"+head);
		System.out.println("tail :"+tail);
		percentage = (float)(head*100)/a.length;
		percentage1 = (float)(tail*100)/a.length;
			
		System.out.println("head percentage "+percentage);
		System.out.println("tail percentage "+percentage1);
			
		}
		
	
//************************************************************************************
//Assignment:3
//Leap Year
//I/P -> Year, ensure it is a 4 digit number.
//Logic -> Determine if it is a Leap Year.
//O/P -> Print the year is a Leap Year or not.
	
	public static void leapYear(int num) 
	{
		int length = String.valueOf(num).length();
		if(length==4)
		{
			if(num%4==0||num%400==0) 
			{
				System.out.println("Year you entered is leap");
			}
			else 
			{
				System.out.println("Year you entered is not leap");
			}
		}
		else 
		{
			System.out.println("Please enter the 4 digit number...you need to enter year");
		}
	}
	
//************************************************************************************
//Assignment:4
//Power of 2 
//Desc -> This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
//I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
//Logic -> repeat until i equals N.
//O/P -> Print the year is a Leap Year or not.
	
	public static void powerofTwo(int n) 
	{
		 int i = 0;
		 int powerOfTwo = 1;
		 if(n<31)
		 {
			 while(i<=n) 
		     {
		          System.out.println("power of two at "+i+" :" + powerOfTwo);   
		          powerOfTwo = 2 * powerOfTwo; 
		          i = i+1;
		     }
			 
		     int length = String.valueOf(powerOfTwo).length();
		     
		      
		 }
		 else 
		 {
			 System.out.println("Only works if 0 <= N < 31 since 2^31 overflows an int"); 
		 }
		
	}
	

//************************************************************************************
//Assignment:5
	public static void harmonic(int num) 
	{
		int i;
		int harmonic =0;
		float result=0;
		for(i=1;i<=num;i++) 
		{
			result = result+(float)1/i;
			System.out.println("At "+i+" : "+result);
		}
		
	}
	
//************************************************************************************
//Assignment:6
//Factors
//Desc -> Computes the prime factorization of N using brute force.
//I/P -> Number to find the prime factors
//Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
//O/P -> Print the prime factors of number N.

	public static void primeFactor(int n) 
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		for(int i=2;i<=n;i++) 
		{
			while(n%i==0) 
			{
				l.add(i);
				n=n/i;
			}
		}
		
		/*for(int res:l) 
		{
			System.out.println(res);
		}*/
		
		System.out.println("Prime Factors");
			Iterator itr =l.iterator();
			while(itr.hasNext())
			{
				 System.out.println(itr.next());
			}
		   
			
		}
		
//************************************************************************************
//Assignment:7
//Gambler
//Desc -> Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out.
//I/P -> $Stake, $Goal and Number of times
//Logic -> Play till the gambler is broke or has won
//O/P -> Print Number of Wins and Percentage of Win and Loss.

	public static void gambler(int stake,int goal,int tries) 
	{
		int win=0;
		int loss=0;
		
		for(int i=0;i<tries;i++) 
		{
			int cash =stake;
			while(cash >0 && cash<goal) 
			{
				
				if(Math.random()>0.5) 
				{
					cash++;
				}
				else 
				{
					cash--;
				}
			}
			if(cash==goal) 
			{
				win++;
			}
			else 
			{
				loss++;
			}
		}
		System.out.println("tries"+tries);
		System.out.println("Game winning percentage : " + 100.0 * win / tries);
		System.out.println("loss percentage :"+(100.0*loss)/tries);
		
       
	}

//**************************************************************************************
//Assignment:8
//Coupon Numbers
//Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? This program simulates this random process.
//I/P -> N Distinct Coupon Number
//Logic -> repeatedly choose a random number and check whether it's a new one.
//O/P -> total random number needed to have all distinct numbers.
//Functions => Write Class Static Functions to generate random number and to process distinct coupons.
	
	public static int collect(int n)
	{
        boolean[] isCollected = new boolean[n];  
        int count = 0;                          
        int distinct  = 0;   
       
        while (distinct < n) 
        {
            int value = getCoupon(n);             
            count++;    
           
            if (!isCollected[value])
            {          
                distinct++;
                isCollected[value] = true;
            }
        }
       return count;
       
       
    }
	
	private static int getCoupon(int n)
	{
		double random= Math.random() * n;
		System.out.println("random number "+random);
		return (int) random;
    }
	
	
//**************************************************************************************
//Assignment9:
//2D Array
//Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
//I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
//Logic -> create 2 dimensional array in memory to read in M rows and N cols 
//O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with 
//OutputStreamWriter to print the output to the screen.

	public static void twodiArray(int[][] arr,int r,int c) throws IOException 
	{
		int i,j;
		PrintWriter pw = new PrintWriter(System.out,true);
		//OutputStreamWriter op = new OutputStreamWriter(System.out);

		System.out.println("using printwriter");
		int len=r*c;
		for(i=0;i<r;i++) 
		{
			for(j=0;j<c;j++) 
			{
				System.out.println(arr[i][j]);
				pw.write(arr[i][j]);
			}
			System.out.println("");
		}
	}
	
	
//**************************************************************************************
//Assignment:10
//Sum of three Integer adds to ZERO
	
	
	//findingTriplate
	public static void findTriplate(int[] ar, int n) 
	{
		
		int flag=0;
		for(int i=0;i<n-2;i++) 
		{
			for(int j=i+1;j<n-1;j++) 
			{
				for(int k=j+1;k<n;k++) 
				{
					
					if(ar[i]+ar[j]+ar[k]==0) 
					{
						System.out.println(" "+ar[i]+" "+ar[j]+" "+ar[k]+" ");
						flag=1;
					}
				}
			}
			
		}
		if(flag==0) 
		{
			System.out.println("not exist");
		}
		
	}

//*************************************************************************************
//Assignment:11
//Write a program Distance.java that takes two integer command-line arguments x and y and 
//prints the Euclidean distance from the point (x, y) to the origin (0, 0). 
//The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
		
	//Math function
	public static void mathFunction(int x, int y) 
	{
		
		double a=Math.pow(x, 2);
		double b=Math.pow(y, 2);
		double c=a+b;
		double function = Math.sqrt(c);
		System.out.println("x^2 +y^2 = "+c);
		System.out.println("square root of: "+c+" : "+function);
		
		
	}

	
	
//*********************************************************************************
//Assignment:12
//Write static functions to return all permutation of a String using iterative method and 
//Recursion method. Check if the arrays returned by two string functions are equal.
	
	//StringPermutation
	public static void StringPermute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i);  
                StringPermute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    }
	
	private static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    }
	
//*********************************************************************************
//Assignment:13
//Simulate Stopwatch Program
//Desc -> Write a Stopwatch Program for measuring the time that elapses between the start and end clicks
//I/P -> Start the Stopwatch and End the Stopwatch
//Logic -> Measure the elapsed time between start and end
//O/P -> Print the elapsed time.
	
	public static void StopWatchFunction()
	{
		long Start=0;
		long Stop=0;
		long elapsed_time;
		Scanner s1 = new Scanner(System.in);
		System.out.println("press 1 to start");
		int start = s1.nextInt();
		
		if(start==1) 
		{
			Start = System.currentTimeMillis();
			System.out.println(Start);
		}
		
		System.out.println("press 2 to stop");
		int stop = s1.nextInt();
		if(stop==2) 
		{
			Stop=System.currentTimeMillis();
			System.out.println(Stop);
		}
		
		elapsed_time=Stop-Start;
		System.out.println("elapsed time "+elapsed_time);
		
		
	}

//*******************************************************************************
//Assignment:14
//TicToc
//*******************************************************************************
//Assignment:15
//Quadratic Equation

	public static void quadraticEqu(int a,int b,int c) 
	{
		int delta = b*b - 4*(a*c);
		double root1 =(-b + Math.sqrt(delta))/(2*a);
		double root2 =(-b - Math.sqrt(delta))/(2*a);
		System.out.println("1 st root : "+root1);
		System.out.println("2 nd root : "+root2);
	}
	
//**********************************************************************************
//Assignment:16
//WindChill

	public static void windchill(double t,double v) 
	{
		double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
	    System.out.println("Temperature = " + t);
	    System.out.println("Wind speed  = " + v);
	    System.out.println("Wind chill  = " + w);
	} 
	
//**********************************************************************************
//part2
//Anagram
	public static void Anagram(String f1,String f2) 
	{
		int l1 = f1.length();
		int l2 = f2.length();
		if(l1!=l2) 
		{
			System.out.println("not Anagram..");
		}
		else 
		{
			String str1=Sort(f1);
			System.out.println(str1);
			String str2=Sort(f2);
			System.out.println(str2);
			
			if(str1.equals(str2))
			{
				System.out.println("Anagram");
			}
			else 
			{
				System.out.println("Not Anagram");
			}
		}
	}
	
	private static String Sort(String s1)
    {
        char ch[]=s1.toCharArray();         
        String res=" ";
        for(int i=0; i<ch.length ; i++)
        {
            for(int j=i+1;j<ch.length; j++)
            {
                if(ch[i]>=ch[j])
                {
                    char m=ch[i];
                    ch[i]=ch[j];
                    ch[j]=m;
                }
            }
            res=res+ch[i];
        }
        return res;
    }
	
//********************************************************************************
//Prime
	private static boolean isPrime(int n) 
	{  
	       if (n <= 1) 
	       {  
	           return false;  
	       }  
	       
	       for (int i = 2; i <= Math.sqrt(n); i++) 
	       {  
	           if (n % i == 0) 
	           {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
	public static void collect() 
	{
		int arr[] = new int[8];
		int j=0;
		for(int i=0;i<1000;i++) 
		{
			 if (isPrime(i)) 
			 {  
	               System.out.println(i); 
	               arr[j]=i;
	               
	               
	         }  
		}
		int k = arr.length;
		Utility.angramWithPrime(arr, k);
	}
//***************************************************************************
//AnagramWithPrime
		public static void angramWithPrime(int arr[],int k) 
		{
			int i;
			String str1;
			String st[] = new String[k];
			for(i=0;i<k;i++) 
			{
				str1=Integer.toString(arr[i]);
				char ch[] = str1.toCharArray();
				Arrays.sort(ch);
				str1 = String.valueOf(ch);
				st[i]=str1;
			}
			for(i=0;i<k;i++) 
			{
				System.out.println(st[i]);
			}
			
		}
}



	


