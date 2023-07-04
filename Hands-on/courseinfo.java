package oops;

public class courseinfo {
	private String Teachername;
	
	private int Studentscount;
	private String Duration;
	private String Classname;
	private String Center;
	

	public String getTeachername() {
		return Teachername;
	}


	public void setTeachername(String teachername) {
		Teachername = teachername;
	}


	public int getStudentscount() {
		return Studentscount;
	}


	public void setStudentscount(int studentscount) {
		Studentscount = studentscount;
	}


	public String getDuration() {
		return Duration;
	}


	public void setDuration(String duration) {
		Duration = duration;
	}


	public String getClassname() {
		return Classname;
	}


	public void setClassname(String classname) {
		Classname = classname;
	}


	public String getCenter() {
		return Center;
	}


	public void setCenter(String center) {
		Center = center;
	}


}
class Coursedetails
{
	public static void main(String[] args)
	{
		
		courseinfo c=new courseinfo();
		c.setCenter("Thane");
		c.setClassname("ANP");
		c.setTeachername("Vaibhav");
		c.setStudentscount(10);
		c.setDuration("4Hours");
		System.out.println("Center name :" + c.getCenter());
		System.out.println("Class name :" + c.getClassname());
		System.out.println("Teacher name :" + c.getTeachername());
		System.out.println("Students count :" + c.getStudentscount());
		System.out.println("Duration :" + c.getDuration());
		
		
				
				
				
				
	}
}


