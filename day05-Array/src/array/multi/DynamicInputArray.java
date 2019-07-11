package array.multi;

import java.util.Scanner;

/**
 * 정수를 저장하는 동적 2차 배열을 numbers2nd 생성
 * 
 * numbers의 사이즈 : 4
 * numbers[0] = 5
 * numbers[1] = 3
 * numbers[2] = 2
 * numbers[3] = 7
 * 
 * 각각의 사이즈를 Scanner 로 입력받아서 생성
 * 생성된 배열안에는 10 ~ 170까지의 숫자를 저장
 * @author Administrator
 *
 */
public class DynamicInputArray {

	public static void main(String[] args) {
		// 1. 선언
		Scanner scan = new Scanner(System.in);
		int[][] numbers2d;
		int input;
		int value = 0;
		// 2. 2차 배열 입력하여 생성
		System.out.println("2차배열의 크기를 입력하세요.");
		input = scan.nextInt();
		numbers2d = new int[input][];
		for (int idx = 0; idx < numbers2d.length; idx++) {
			System.out.printf("인덱스[%d]1차 배열 크기 입력:%n",idx);
//			input = scan.nextInt();
			numbers2d[idx] = new int[scan.nextInt()];
			for (int ind = 0; ind < numbers2d[idx].length; ind++) {
				numbers2d[idx][ind] = (value += 10);
			}
			
		}
		
		for (int array[]: numbers2d) {
			for (int num: array) {
				System.out.printf("%3d ",num);
			}
			System.out.println();
		}
		
	}

}
