package Loops;

import java.util.Scanner;

/*
 Write a Java program that takes a year as input and checks if it is a leap year.
  If the year is divisible by 4, check if it is also divisible by 100.
   If it is divisible by 100, check if it is also divisible by 400. 
   Print "Leap Year" if it satisfies all the conditions, and "Not a Leap Year" otherwise.
 */
public class Leapyear {

	public static void main(String[] args) 
	{int a;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a value");
	a=s.nextInt();
	if(a%4==0)
	{
		if(a%100==0)
		{
			if(a%400==0)
			{
				System.out.println("Leap Year");
			}
			else
			{
				System.out.println("Not a Leap Year");
			}
		}
		else
		{
			
			
				System.out.println("Not a Leap Year");
			
		}
	}
	else
	{
		System.out.println("Not a Leap Year");
	}
		

	}

}
