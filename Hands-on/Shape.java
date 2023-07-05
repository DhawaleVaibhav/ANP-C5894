package oops;

 class Shape 
{
public void calculateArea()
{
	System.out.println("Calculating area of the shape");
}

}
class Rectangle extends Shape
{
	//@overide
	public void calculateArea()
	{
		System.out.println("Calculating area of the rectangle");
	}
}
class singlelevelinheritanceproblem
{
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();
		r.calculateArea();
	}
	
}
