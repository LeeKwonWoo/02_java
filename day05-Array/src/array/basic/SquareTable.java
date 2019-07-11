package array.basic;

/**
 * 정수를 원소로 가지는 배열 numbers를 선언 
 * 1. for (index 사용하는 전통적인 for) 구문을 사용하여 1~10까지 정수를 저장한다. 
 * 2. foreach 구문을 사용하여 1에서 저장된 값의 제곱표를 출력한다.
 * 
 * @author Administrator
 *
 */
public class SquareTable {

	public static void main(String[] args) {
		int[] numbers;
		numbers = new int[10];

		for (int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = idx + 1;
		}
		for (int num : numbers) {
			System.out.printf("%2d x %2d = %3d%n", num, num, num * num);
		}
	}

}
