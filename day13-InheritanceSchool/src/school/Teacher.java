package school;
/**
 * 학교시스템에서
 * 과목을 가르치는 선생의 정보를 저장하는 클래스
 * 사람의 공통 정보를 담는 클래스인 Person을 상속한다.
 * @author Administrator
 *
 */
public class Teacher extends Person {
	// 1. 멤버변수
	private String subject;
	// 2. 생성자
	public Teacher() {
		
	}
	/**
	 * Teacher 만의 필드인 subject를 초기화하는 생성자
	 * @param subject
	 */
	public Teacher(String subject) {
		this.subject = subject;
	}
	/**
	 * Person에서 물려받은 전체필드를 빌려 초기화하는 생성자
	 * subject는 직접초기화
	 * @param id
	 * @param name
	 * @param age
	 * @param subject
	 */
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
	// 3. 메소드
	// (1) toString() 재정의
	@Override
	public String toString() {
		String teaStr = String.format(", 과목:%s",subject);
		return String.format("선생정보[%s%s]",super.toString(),teaStr);
//		return super.toString() + "과목:"+ subject;
	}
}
