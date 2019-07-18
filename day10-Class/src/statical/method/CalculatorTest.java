package statical.method;
import static statical.method.Calculator.subtract;
/**
 * Calculator 클래스에 있는
 * static 메소드를 테스트하는 클래스
 * ---------------------------------
 * static 메소드는
 * 클래스이름.메소드이름(아규먼트);
 * 의 방식으로 호출
 * @author Administrator
 *
 */
public class CalculatorTest {

	public static void main(String[] args) {
		double result = Calculator.add(1.0, 2.5);
		System.out.println(result);
		int addResult = Calculator.add(1, 2);
		System.out.println(addResult);
		// 자바에서는 클래스의 static필드들(변수,메소드)에 대해서
		// static import 지원
		// static import 구문을 클래스 선언 위쪽에 작성한 경우
		// 메소드 이름만으로 호출할 수 있다.
		int subresult = subtract(1, 2);
		System.out.println(subresult);
		/**
		 * 교보문고 -> 책종류 -> 북매니저 -> 벽서가 위에서 책을꺼내줌
		 * 책한권정의하는 클래스
		 * 책장 클래스
		 * 책장관리하는 북매니저 클래스
		 * 북스토어 클래스
		 */
	}

}
