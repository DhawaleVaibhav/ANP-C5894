package operators;
/*
 Write a Java program that takes two integer inputs from the user
  and swaps their values using bitwise operators. 
  After swapping, print the updated values of the two integers.
 */
import java.util.Scanner;

public class BitwiseSwap 
{

	public static void main(String[] args) 
	{
		//Scanner class object
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        //print before Swapping
        System.out.println("Before swapping:");
        System.out.println("First integer: " + num1);
        System.out.println("Second integer: " + num2);

        // Swap the values using bitwise XOR  operator
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        
        //print after Swapping
        System.out.println("After swapping:");
        System.out.println("First integer: " + num1);
        System.out.println("Second integer: " + num2);

        scanner.close();
	}

}
