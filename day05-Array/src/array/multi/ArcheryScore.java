package array.multi;

import java.util.Scanner;

/**
 * 3명의 양궁선수가 맞힌 과녁의 점수를 각각 차시(9차시까지) 별로 배열에 입력하고
 * 전체 합산 점수가 가장 높은 선수의 인데스와 점수를 출력
 * @author Administrator
 *
 */
public class ArcheryScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][9];
		int[] sum = new int[3];
		int max = 0;
		
		System.out.println("양궁 선수 점수 입력:");
		for (int idx = 0; idx < score.length; idx++) {
			System.out.println((idx+1)+"번째 양궁 선수 점수 입력");
			for(int ind = 0; ind < score[idx].length; ind++) {
				score[idx][ind] = scan.nextInt();
				sum[idx] += score[idx][ind];
				if(sum[idx] > max) {
					max = sum[idx];
				}
			}
		}
		System.out.println("우승선수");
		for (int idx = 0; idx < sum.length; idx++) {
			if(max == sum[idx]) {
				System.out.printf("%d번째 선수의 합산점수는 %d입니다.",idx+1,sum[idx]);
			}
		}
		
	}

}
