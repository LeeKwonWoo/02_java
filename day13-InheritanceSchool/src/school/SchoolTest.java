package school;
/**
 * 학교시스템을 테스트하는 클래스
 * -------------------------------
 * Person과 상속관계인
 * Student, Employee, Teacher를
 * 테스트하는 클래스이다.
 * @author Administrator
 *
 */
public class SchoolTest {

	public static void main(String[] args) {
		// 1. 선언 
		//Person 배열타입의 변수 persons 를 선언
//		Person[] persons;
		//2. 초기화
		// (1) person 를 3사이즈로 생성
//		persons = new Person[3];
		// (2) person 배열의 각각 0~2 인덱스에
		// [0] : Student : id = S01, name= 홍길동, age = 18, major= 도술
		// [1] : Teacher : id = T01 ,name= 정약용 age = 32, subject = 실학
		// [2] : Employee: id = E01 , name = 허균 , age = 48 , dept = 문학예술지원부
		Person[] persons = {new Student("S01","홍길동",18,"도술"),
			 				new Teacher("T01","정약용",32,"실학"),
			 				new Employee("E01","허균",48,"문학예술지원부")};
		
		// 3. 사용
		// foreach사용 persons 배열의 각엘리먼트 대하여
		// print() 메소드 호출
		for(Person person : persons) {
			// 가상메소드 호출
			// 상위클래스에 정의된 메소드를 호출해도
			// 실제 인스턴스 타입의 하위클래스에 재정의된
			// 메소드가 응답하는 것
			// 가상메소드 호출이 되기 위해서는
			// 반드시 상속이 전제되어야함
			person.print();
		}
	}

}
