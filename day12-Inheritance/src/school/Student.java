package school;

public class Student extends Person{
	private String major;
	
	Student(String id,String name, int age) {
		super(id,name,age);
	}
	Student(String id,String name, int age,String major) {
		super(id,name,age);
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + major;
	}
}
