package Loops;

import java.util.Scanner;
/*
 Write a Java program that prompts the user 
 to enter a number and then prints the
  multiplication table of that number using a for loop. 
  The table should display multiplication from 1 to 10.
 */
public class newmultiplication {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a  Number");
         int n=s.nextInt();
         int ans =0;
         int a=1;
         
         for(int i=1;i<=10;i++)
         {
          
        	 ans=n*a ;
        	 
        	 
        	 
        	 System.out.println(n +"*"+ a +"="+ ans);
        	a++;
         }
         
         s.close();

	}

}
