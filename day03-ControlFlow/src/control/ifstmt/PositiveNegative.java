package control.ifstmt;

import java.util.Scanner;

/*
 * 하나의 정수를 입력받아서
 * 음수인지, 양수인지 0인지 판단하는 클래스
 * 입력받을 변수 input을 선언하여 Scanner 로 입력받고
 * if~else 구문으로 부호를 판별한 후
 * 판별 결과를 저장하는 변수 String result 에 저장하여
 * "입력값 100은 양수 입니다.
 * 입력값 -1은 음수 입니다.
 * 입력값은 0 입니다.
 */
public class PositiveNegative {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int input;
		String result;
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		input = scan.nextInt();
		// 3. 사용
		if(input > 0) {
			result = "양수";
		} else if(input < 0) {
			result = "음수";	
		} else {
			result = "0";
		}
		System.out.printf("입력값 %d은(는) %s 입니다.",input,result);
	}

}
