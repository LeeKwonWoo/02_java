package control.ifstmt;

import java.util.Scanner;

/*
 * 학점을 계산하는 클래스
 * ---------------------
 * A : 90이상
 * B : 80이상
 * C : 70이상
 * D : 60이상
 * F : 다머지
 */
public class Grade {

	public static void main(String[] args) {
		// 1.선언
		int score;
		char grade;
		Scanner scan;
		// 2. 초기화
		scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		score = scan.nextInt();
		// 3. 사용
		if(score >= 90 && score <= 100) {
			grade = 'A';
		} else if (score >= 80 && score < 90) {
			grade = 'B';
		} else if (score >= 60 && score < 80) {
			grade = 'C';
		} else if (score >= 40 && score < 60) {
			grade = 'D';
		} else if (score >= 0 && score < 40) {
			grade = 'F';
		} else {
			grade = 'X';
		}
		System.out.printf("이 점수는 %s 입니다.",grade);
	}

}
