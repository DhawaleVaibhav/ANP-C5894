package Loops;
import java.util.*;
public class Divisiblenestedif
{

	public static void main(String[] args)
	{
		int a;
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		a=s.nextInt();
		
			
		
		
		
		
		if ((a%2==0)&&(a%3==0))
		{
			System.out.println("Number is divisible by both");
		}
		else if(a%3==0)
		{
			System.out.println("Number is divisible by 3 ");
		}
		else if(a%2==0)
		{
			System.out.println("Number is divisible by 2 ");
		}
		else 
		{

			System.out.println("Number is not divisible  ");
		}
		
	}
	

	}
