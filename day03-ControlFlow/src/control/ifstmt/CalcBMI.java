package control.ifstmt;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		// 1. 선언
		double weight;
		double height;
		double bmi;
		Scanner scan;
		String result;
		// 2. 초기화
		scan = new Scanner(System.in);
		System.out.printf("키(cm):");
		height = scan.nextDouble();
		System.out.printf("몸무게(kg):");
		weight = scan.nextDouble();
		bmi = weight/(height*height)*10000;
		// 3. 사용
		if(bmi<15.0) {
			result = "병적인 저체중";
		} else if (bmi >= 15.0 && bmi<18.5) {
			result = "저체중";
		} else if (bmi >= 18.5 && bmi <23.0) {
			result = "정상";
		} else if (bmi >= 23.0 && bmi <= 27.5) {
			result = "과체중";
		} else if (bmi > 27.5 && bmi <= 40.0) {
			result = "비만";
		} else {
			result = "병적인 비만";
		}
		System.out.printf("bmi 지수 %.2f는 %s입니다.",bmi,result);
	}

}
