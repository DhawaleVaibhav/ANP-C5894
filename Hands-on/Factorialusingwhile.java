package Loops;

import java.util.Scanner;
/*Write a Java program that prompts the user 
to enter a positive integer and calculates its
 factorial using a while loop. 
 The program should display the factorial as the output.*/
public class Factorialusingwhile {

	public static void main(String[] args) 
	
	
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a POsitive Number");
         int n=s.nextInt();
         int Fact=1;
         while(n != 0)
         {
        	 Fact= Fact *n ;
        	 n--;
         }
         System.out.println("Factorial value =" + Fact);

	
	}
	
}