package operators;
/*
Write a Java program that prompts the user to enter their age. 
The program should check if the age is between 18 and 30 (inclusive) and
 print "Eligible for Job" if true, or "Not Eligible for Job" otherwise.
 */
import java.util.Scanner;
public class Age
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age =sc.nextInt();
		
				
		if((age>=18)&&(age <=30))
		{
			System.out.println("Eligible for Job");
		}
		else
		{
			System.out.println("Not Eligible for Job");
		}
        
	}

}
