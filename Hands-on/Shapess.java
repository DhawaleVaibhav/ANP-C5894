package oops;

public abstract class Shapess 
{
	int area;
	int l = 5;
	int b = 4;
	int perimeter;
	
	int r = 4 ;
	int a =3  ;
	int h=4;
	int c=7;
	
	
public abstract void calculateArea();
public abstract void calculateperimeter();

}
class Rectangles extends Shapess
{
	public void calculateArea() 
	{
		
	
	area = l*b ;
	
	
	}
	public void calculateperimeter()
	{
		perimeter = 2*(l + b);
		
		
	}
	
}
class Circle extends Shapess
{
	public void calculateArea() 
	{
		
	
	area = 180*r*r ;
	
	
	}
	public void calculateperimeter()
	{
		perimeter = 2*180*r;
		
		
	}
}
class Triangle extends Shapess
{
	public void calculateArea() 
	{
		
	
	area =  b*h ;
	
	
	}
	public void calculateperimeter()
	{
		perimeter = a + b+c;
				
	}
}
class Shapessmain
{
	public static void main(String[] args)
	{
		Circle c=new Circle();
		Rectangles r=new Rectangles();
		Triangle t=new Triangle();
		c.calculateArea();
		c.calculateperimeter();
		r.calculateArea();
		r.calculateperimeter();
		t.calculateArea();
		t.calculateperimeter();
		System.out.println("area of circle" + c.area);
		System.out.println("perimeter of circle" + c.perimeter);
		System.out.println("area of rectangle" + r.area);
		System.out.println("perimeter of rectangle" + r.perimeter);
		System.out.println("area of Triangle" + t.area);
		System.out.println("perimeter of triangle" + t.perimeter);
		
		
	}
}