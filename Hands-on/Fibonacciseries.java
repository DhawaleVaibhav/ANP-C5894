package Loops;
/*
 Write a program that prints the Fibonacci series 
 up to a specified limit entered by the user. 
 However, skip printing numbers that are divisible by 3.
  Use the continue statement to skip such numbers.
 */
import java.util.Scanner;
public class Fibonacciseries 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int number=sc.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		System.out.println("Fibonacci series :");
		System.out.println(a);
		System.out.println(b);
		for(int i=1;i<=number;i++)
		{
			sum = a + b;
			if (sum % 3 ==0)
  			  
	    		  {
				   a=b;
				   b=sum;
	    		  continue;
	    		  }
			System.out.println(sum);
			
			a = b;
			b = sum;
			
		}
		
		
        sc.close();   
	}

}
