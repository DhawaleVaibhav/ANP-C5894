package operators;
/*
 Write a Java program that takes an integer input from the user 
 and checks if it is even or odd using bitwise operators.
  Print "Even" if the number is even, and "Odd" if the number is odd.
 */
import java.util.Scanner;
public class EvenOddUsingBitwise
{

	public static void main(String[] args) 
	{
	  //Scanner class object
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter a Number");
      
      //enter number
      int number = sc.nextInt();
      
      //condition to check number is even 
      if((number & 1) == 0)
      {
    	  System.out.println("Even Number");
      }
      else
      {
    	  System.out.println("Odd Number");
      }
      sc.close();
	}

}
