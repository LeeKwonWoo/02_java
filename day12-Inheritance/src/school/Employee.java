package school;

public class Employee extends Person {
	private String dept;
	
	Employee(String id,String name, int age) {
		super(id,name,age);
	}
	Employee(String id,String name, int age,String dept) {
		super(id,name,age);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString() + dept;
	}
}
