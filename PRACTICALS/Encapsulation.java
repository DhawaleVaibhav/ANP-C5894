package oops;

class Encapsulation {
	private String name;
	private int age;
	

	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public int getAge() 
	{
		return age;
	}


	public void setAge(int age) 
	{
		this.age = age;
	}

}
class Main 
{
	public static void main (String[] args)
	{
		Encapsulation e=new Encapsulation();
		e.setName("Vaibhav");
		e.setAge(21);
		System.out.println("Name is :" + e.getName());
		System.out.println("Age is :" + e.getAge());
		
	}
	
}

