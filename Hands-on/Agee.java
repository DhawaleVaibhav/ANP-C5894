package operators;

/*
 Write a Java program that prompts the user to enter their age.
  The program should check if the age is greater than or equal to 18 and
   print "You are an adult" if true, or "You are a minor" otherwise.
 */
import java.util.Scanner;
public class Agee
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age =sc.nextInt();
		
		if(age >=18)
		{
			System.out.println("You are Adult");
		}
		else
		{
			System.out.println("You are Minor");
		}
	}

}
