package oops;

public class overloading {
	public int subtract(int a,int b) 
	{
		return a-b;
	}
	public int subtract(int a,int b,int c) 
	{
		return a-b-c;
	}
	public double subtract(double a,double b) 
	{
		return a-b;
	}
}
class overloadingexamle
{
	public static void main(String[] args)
	{
		overloading o=new overloading();
		System.out.println("The sum is :" + o.subtract(6,7));
		System.out.println("The sum is :" + o.subtract(8,3,10));
		System.out.println("The sum is :" + o.subtract(17.00,5.00));
	}
}
