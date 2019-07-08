package control.ifstmt;

import java.util.Scanner;

/**
 * 입력된 정수에 대해서 2의 배수인지 판별하는 클래스
 * 
 * Scanner를 사용하여 입력된 정수를 input 변수 저장하고
 * 입력된 값이 2의 배수인지 판단하는 조건을 작성
 * 2의 배수 판별 결과는 String result 에 저장
 * (1)------------------------------------------------------
 * 2의 배수 일때 : "입력값 4은(는) 2의 배수입니다."
 * 2의 배수가 아닐때 "입력값 5은(는) 2의 배수가 아닙니다."
 * (2)------------------------------------------------------
 * 나머지는 int mod 에 저장하여 사용하시오.
 * 2의 배수 일때 : "입력값 4은(는) 2의 배수입니다."
 * 2의 배수가 아닐때 "입력값 5은(는) 2의 배수가 아닙니다."
 * 					 "나머지가 1입니다."
 * @author Administrator
 *
 */
public class MultipleOfTwo {

	public static void main(String[] args) {
		//1. 선언
		int input;
		int mod;
		String result;
		Scanner scan;
		// 2. 초기화
		scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		input = scan.nextInt();
		// 3. 사용
		if(input%2 == 0) {
			result = "2의 배수입니다.";
			System.out.printf("입력값 %d 은(는) %s",input,result);
		} else {
			result = "2의 배수가 아닙니다.";
			mod = input%2;
			System.out.printf("입력값 %d 은(는) %s%n나머지가 %d 입니다.",input,result,mod);
		}
	}

}
