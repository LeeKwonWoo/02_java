package array.multi;

import java.util.Scanner;

/**
 * 야구 구단의 1~5선발 선수의 방어율을 입력하고 그 중 가장 방어율이 낮은 최고의 투수를 찾는 클래스
 * @author Administrator
 *
 */
public class BestPitcher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] ERA = new double[3][5];
		double min = 10.0;
		
		// 각 팀별로 각 투수의 방어율 입력받아 배열에 저장한다.
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율입력");
		for (int idx = 0; idx < ERA.length; idx++) {
			System.out.println((idx+1)+"번째 팀 1~5선발 투수 방어율:");
			for(int ind = 0; ind < ERA[idx].length; ind++) {
				ERA[idx][ind] = scan.nextDouble();
				if(min>ERA[idx][ind]) {
					min = ERA[idx][ind];
				}
			}
		}
		
		System.out.println("최고의 투수는");
		for (int idx = 0; idx < ERA.length; idx++) {
			for(int ind = 0; ind < ERA[idx].length; ind++) {
				if (min == ERA[idx][ind]) {
					System.out.printf("%d번째 팀의 %d선발 투수의 방어율은 %.1f입니다.%n",idx+1,ind+1,ERA[idx][ind]);
				}
			}
		}
		
	}

}
