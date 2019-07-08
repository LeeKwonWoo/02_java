package operator.ternary;

import java.util.Scanner;

/*
 * 삼항 연산자 (조건식 ? 값1 : 값2) 를 테스트하는 클래스
 * -----------------------------------------------------
 * 조건식 : 연산결과가 항상 true/false 타입의 데이터로 나와야함
 * 값1 : 조건식의 결과가 true 일 때 선택됨
 * 값2 : 조건식의 결과가 false 일떄 선택됨
 * -------------------------------------------------------------
 * 값1 ,값2의 데이터 타입이 일치해야 한다.
 * 수학의 절댓값 계산을 할 떄 활용해보자.
 */
public class TernaryTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int x = 10;
		int y = -10;
		
		int abX = (x>=0 ? x : -x);
		int abY = (y>=0 ? y : -y);
		
		// 3. 사용
		System.out.printf("x=%d 일 때, x의 절대값은? %d%n",x,abX);
		System.out.printf("y=%d 일 때, y의 절대값은? %d%n",y,abY);
		// 스캐너를 사용하여 입력받은 정수에 대해
		// 절댓값을 구해보자.
		// 1. 스캐너 선언
		Scanner scan;
		int z;
		int abZ;
		// 2. 스캐너 및 변수 초기화
		scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		z = scan.nextInt();
		abZ = (z>=0 ? z : -z);
		
		System.out.printf("z=%d 일 때, z의 절대값은? %d%n",z,abZ);
		
	}

}