package control.ifstmt;

import java.util.Scanner;

/**
 * 입력된 세 정수 중 가장 큰 값을 판별하는 클래스 입력값은 각각 int num1, int num2, int num3; 변수에 저장 가장 큰
 * 값은 int max; 변수에 저장
 * 
 * @author Administrator
 *
 */
public class MaxOfThree {

	public static void main(String[] args) {
		// 1. 선언
		int num1;
		int num2;
		int num3;
		int max;
		Scanner scan;
		// 2. 초기화
		scan = new Scanner(System.in);
		// 정수 입력 안내 prompt
		System.out.println("세 정수를 입력하세요");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		// 3. 사용
		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
		}
		// 4. 출력
		System.out.printf("입력된 세 값 %d %d %d 중 가장 큰 값: %d%n", num1, num2, num3, max);
	}

}
