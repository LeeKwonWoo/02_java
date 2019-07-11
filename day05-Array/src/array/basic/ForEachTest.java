package array.basic;
/**
 * 자바 1.5부터는 지원되는
 * 향상된 for 반복문의 기능
 * -----------------------
 * 데이터구조와 함께 사용한다.
 * 
 * 데이터구조 :
 * 1. 배열
 * 2. 리스트
 * 3. 맵
 * 4. 셋
 * @author Administrator
 *
 */
public class ForEachTest {

	public static void main(String[] args) {
		// 1. 배열의 선언
		int[] numbers = {1,2,3,4,5};
		int sum = 0;
		// 3. foreach 구문으로 배열 값 출력
		// for (원소의 타입 변수이름: 자료구조(==배열){
		// 문장들;
		// }
		for (int num: numbers) {
			sum += num;
			System.out.println("num="+num);
		}
		System.out.println("sum="+sum);

	}

}
