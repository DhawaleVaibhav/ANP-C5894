package Loops;
/*
Write a program that prompts the user to enter a series of integers.
 The program should calculate the sum of all the even numbers entered,
skipping any negative numbers. Use the continue statement to skip negative numbers.
 */
import java.util.Scanner;
public class SumOfEvenNumbersUsingContinue 
{

	public static void main(String[] args)
	{
		
      Scanner sc=new Scanner(System.in);
      int sum=0;
      int number;
      
      do
      {
    	  System.out.println("Enter a Even Number and to exit Enter 0 :");
    	  number=sc.nextInt();
    	      	  for(int i=1;i<=1;i++)
    	  {
    		  
    		  //to reject negative number and odd number (condition for 1 question) 
    		  if((number<0) || (number % 2 != 0))
    		  {
    		 
    		  continue;
    		  }
    		  
    		  sum = sum + number;

        	 
    	  }
    	  
      }while(number!=0);
      
      System.out.println("Sum of Numbers : " + sum);
      sc.close();
	}
	

}
