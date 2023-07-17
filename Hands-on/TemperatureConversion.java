package Loops;
import java.util.Scanner;

public class TemperatureConversion 
{

	public static void main(String[] args) 
	{
		int temperature;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Temperature in Celsius");
        temperature=s.nextInt();
        int conversion;
        int operation;
        System.out.println("Temperature conversion");
        System.out.println("----------------------");
        System.out.println("1 - Celsius to Fahrenheit");
        System.out.println("2 - Celsius to Kelvin");
        System.out.println("3 - Celsius to Rankine");
        System.out.println("Enter a Number to Perform Operation");
        operation=s.nextInt();
        switch(operation)
        {
        case 1: 
        	conversion =((9*temperature/5)+32);
        	System.out.println("Fahrenheit Temperature :" + conversion);
        	break;
        case 2: 
        	conversion =(temperature+273);
        	System.out.println("Kelvin Temperature :" + conversion);
        	break;
        case 3: 
        	conversion =(((temperature*9)/5)+ 492);
        	System.out.println("Rankine Temperature :" + conversion);
        	break;
        	default:System.out.println("Invalid Number");
        }
	}

}
