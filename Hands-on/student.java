package oops;

class Student {
	private int rollno;
	private String name;
	private int age;
	private String address;
	

	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


}
class Newmain

{
public static void main (String[] args)
{
Student	s=new Student();
s.setRollno(7);
s.setName("Vaibhav");
s.setAge(21);
s.setAddress("thane");
System.out.println("name is :" + s.getName());
System.out.println("age is :" + s.getAge());
System.out.println("roll no is :" + s.getRollno());
System.out.println("address is :" + s.getAddress());

}
}
