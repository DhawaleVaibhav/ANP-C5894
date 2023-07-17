package Loops;
import java.util.Scanner;
/*
 Write a Java program that asks the user 
 to enter a series of numbers (positive or negative) 
 and calculates their sum. 
 The program should stop asking for input when the user enters 0. 
 Use a do-while loop to continuously ask for numbers and keep adding 
 them to the sum.
 */
public class SumOfSeries 
{

	public static void main(String[] args) 
	{
		//declaring and initialization variable
		int number;
		int sum = 0;
		
		//creating scanner class to accept input from user
		Scanner s = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter a Number");
			
			//accepting input from user
			 number=s.nextInt();
			 
			 sum = sum+number;
			
		}while( number !=0);
		
		System.out.println("Sum Of Numbers =" + sum);
		
		s.close();
	}

}
