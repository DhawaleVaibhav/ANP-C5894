package oops;

class Vehicle 
{
String brand;
int year;
public void displayinfo()
{
System.out.println("brand :" );
System.out.println("year :" );
}
}
class Car extends Vehicle
{
	String model;
	
}
class SportsCar extends Car
{
	int topspeed;
	public void displayinfo()
	{
		System.out.println("brand is :"  );
		System.out.println("year is :" );
		
	}
}
class multilevelinheritanceproblem
{
	public static void main(String[]args)
	{
		SportsCar s=new SportsCar();
		s.brand="honda";
		s.year=23;
		s.model="SP125";
		s.topspeed=200;
		s.displayinfo();
		System.out.println("brand is :" + s.brand);
		System.out.println("year is :" + s.year);
		System.out.println("model is :" + s.model);
		System.out.println("topspeed is :" + s.topspeed);
		
	}
}
