package Loops;
/*
 Grade Calculator:

Prompt the user to enter a numerical grade (0-100).
Use a switch case statement to determine the corresponding letter grade based on the following scale:
90-100: A
80-89: B
70-79: C
60-69: D
0-59: F
Display the letter grade to the user.
Handle input validation to ensure the grade is within the valid range.
 */
import java.util.Scanner;
public class GradeCalculator
{

	public static void main(String[] args)
	{
		
		   //input from the user
	       Scanner sc = new Scanner(System.in);
	       
	       System.out.println("Welcome to the Candidate Scorecard");
	       System.out.println("-------------------------------");
	       System.out.print("Enter the Numerical Grade (0-100) ");
	       
	       int numgrade=sc.nextInt();
	       
	       if(numgrade>100)
	       {
	    	   System.out.println("Invalid Numgrade");
	       }
	       else
	       {
	       switch(numgrade/10)
	       {
	       case 10:
	       case 9:
	    	   System.out.println("Your Grade is : A");
	    	   break;
	       
	       case 8:
	    	   System.out.println("Your Grade is : B");
	    	   break;
	       
	       case 7:
	    	   System.out.println("Your Grade is : C");
	    	   break;
	       
	       case 6: 
	    	   System.out.println("Your Grade is : D");
	    	   break;
           
	       case 5:
	    	   System.out.println("Your Grade is : E");
	    	   break;
	       
	       default:
	    	   System.out.println("Your Grade is : F");
	       
	       }
	       }
	       sc.close();

	}

}
