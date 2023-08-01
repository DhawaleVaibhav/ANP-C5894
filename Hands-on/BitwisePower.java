package operators;
/*
 Write a Java program that takes an integer input from the user 
 and checks if it is a power of 2 using bitwise operators. 
 Print "Yes" if it is a power of 2, and "No" otherwise.
 */
import java.util.Scanner;
public class BitwisePower
{

	public static void main(String[] args) 
	{
		//scanner class object
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        
        //input integer value from user
        int number = scanner.nextInt();

        //check number is greater then 0 and has only 1 bit set
        if (number > 0 && (number & (number - 1)) == 0) 
        {
            System.out.println("Yes");
        } 
        else 
        {
            System.out.println("No");
        }

        scanner.close();
    }

    
}
