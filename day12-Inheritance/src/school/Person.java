package school;

public abstract class Person {
	private String id;
	private String name;
	private int age;

	Person(String id) {
		this.id = id;
	}
	Person(String id,String name) {
		this(id);
		this.name = name;
	}
	Person(String id,String name,int age) {
		this(id,name);
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	public void print() {
		System.out.printf("%s %s %d입니다.",id,name,age);
	}
	public String toString() {
		return String.format("%s %s %d",id,name,age);
	}
}
