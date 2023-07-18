package Loops;
/*
 1 - The continue statement in Java is used to skip the remaining code
 within a loop iteration and proceed to the next iteration.
 It is primarily used to control the flow of a loop and 
 selectively skip certain iterations based on a condition.
 
 2 - Ques.Write a the program that asks the user for the number of iterations 
 they want to perform. It then uses a for loop to iterate from 1 
 to the specified number of iterations.
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
    		  //to reject number divisible by 3 (condition for 2 question)
    		  if ((number % 3 ==0) || (number<0))
    			  
    		  //to reject negative number and odd number (condition for 1 question) 
    		  //if((number<0) || (number % 2 != 0))
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
