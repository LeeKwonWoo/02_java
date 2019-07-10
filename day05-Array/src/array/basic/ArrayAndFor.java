package array.basic;
/**
 * 10칸짜리 int 배열 numbers 를 선언, 초기화 한 후
 * 각 원소의 값을 0번 인데스부터 9번인덱스까지 10, 20, 30, ... 100 까지 저장
 * 배열에 저장된 원소의 합을 int summary; 변수에 누적하여
 * 출력하시오.
 * @author Administrator
 *
 */
public class ArrayAndFor {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int summary = 0;
		int[] numbers;
		numbers = new int[10];
		// 3. 값 저장
		for (int idx = 0; idx < numbers.length; idx++)	{
			numbers[idx] = (idx+1) * 10;
			summary += numbers[idx];
		}
		// 4. 출력
		System.out.printf("numbers 배열의 총합인 summary = %d%n",summary);
	}

}
