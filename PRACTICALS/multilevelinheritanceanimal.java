package oops;
//Example of Multilevel inheritance
	//super class or base class or parent class
public class multilevelinheritanceanimal 
{
	
	  //fields & methods
		String name;
		public void eat()
		{
			System.out.println("Animal Eat....");
		}
	}
	//inherit from Animal
	class Dogs extends multilevelinheritanceanimal
	{
		//fields & methods of Animal class
		//fields & methods of Dog class
		public void sound()
		{
			System.out.println("Dog Barks....");
		}
	}
	class Puppy extends Dog
	{
		//fields & methods of Animal class
		//fields & methods of Dog class
		//fields & methods of Puppy class
			public void colour()
			{
				System.out.println("Black & white....");
			}
	}
	class AnimalMainmultilevelinheritance
	{
		public static void main(String[] args)
		{
			//creating object of sub class
			Puppy p=new Puppy();
			
			//access fields and methods
			p.name="Moti";
			System.out.println("name is :" + p.name);
			p.eat();
			p.sound();
			p.colour();
		}

	}

