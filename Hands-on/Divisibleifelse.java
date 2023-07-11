package Loops;



	import java.util.Scanner;
	public class Divisibleifelse{
		public static void main(String[] args) 
		{int a;
		
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a value");
			a=s.nextInt();	
			if ((a % 5==0)&&(a % 11==0))
			{
				System.out.println("It is divisible by 5 and 11");
			}
			else
			{
				System.out.println("It is not divisible by 5 or 11 or both");
			}
		}
		
	}

