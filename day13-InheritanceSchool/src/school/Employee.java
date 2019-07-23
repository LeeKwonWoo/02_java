package school;
/**
 * 학교 시스템에서 교직원 정보를 저장하는 클래스
 * dept : 소속부서이름
 * @author Administrator
 *
 */
public class Employee extends Person {
	// 1. 멤버변수선언부
	// 직원의 소속부서 이름
	private String dept;
	
	// 2. 생성자 선언부
	//    기본 생성자
	public Employee() {
	
	}
	/**
	 * Employee 만의 필드 dept를 초기화하는 생성자
	 * @param dept : String : 소속부서명
	 */
	Employee(String dept) {
		this.dept = dept;
	}
	/**
	 * Person 에서 물려받은 필드(id, name, age)와
	 * Employee 만의 필드 dept 를 모두 초기화하는 생성자
	 * @param id
	 * @param name
	 * @param age
	 * @param dept
	 */
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
	// 3. 메소드 선언부
	// (1) toString() 재정의
	@Override
	public String toString() {
		String empStr = String.format(", 부서:%s",dept);
		return String.format("직원정보[%s%s]",super.toString(),empStr);
//		return super.toString() +"부서:"+ dept;
	}
}
