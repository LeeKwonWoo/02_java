package control.swtchstmt;

import java.util.Scanner;

/**
 * 다중 선택 switch 구문 사용하여 다음의 기준으로 학점을 계산하는 클래스
 * -------------------------------------- A : 90점이상 B : 80 ~ 89 C : 60 ~ 79
 * 
 * @author Administrator
 *
 */
public class ReportGrade {

	public static void main(String[] args) {
		// 1. 선언
		int score;
		char grade;
		Scanner scan;
		// 2. 초기화
		scan = new Scanner(System.in);
		System.out.println("0~100 사이의 점수를 입력하세요.");
		score = scan.nextInt();
		// 3. 사용
		switch (score / 10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7: case 6:
			grade = 'C';
			break;
		case 5: case 4:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		// 4. 출력
		System.out.printf("점수 %d 는 학점 %c 입니다.", score, grade);
	}

}
