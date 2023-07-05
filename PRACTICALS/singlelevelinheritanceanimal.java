package oops;
//Example of Single level inheritance
	//super class or base class or parent class
public class singlelevelinheritanceanimal
{
	
	  //fields & methods
		String name;
		public void eat()
		{
			System.out.println("Animal Eat....");
		}
	}
	//inherit from Animal
	class Dog extends singlelevelinheritanceanimal
	{
		//fields & methods of Animal class
		//fields & methods of Dog class
		public void sound()
		{
			System.out.println("Dog Barks....");
		}
	}
	class AnimalMain
	{
		public static void main(String[] args)
		{
			//creating object of sub class
			Dog d=new Dog();
			
			//access fields and methods
			d.name="Moti";
			System.out.println("Name is :" + d.name);
			d.eat();
			d.sound();
		}

	
}
