package school;

public class Teacher extends Person {
	private String subject;
	
	Teacher(String id,String name, int age) {
		super(id,name,age);
	}
	Teacher(String id,String name, int age,String subject) {
		super(id,name,age);
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
		return super.toString() + subject;
	}
}
