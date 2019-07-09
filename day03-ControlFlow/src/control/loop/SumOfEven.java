package control.loop;

/**
 * while 문을 이용하여 1~100 사이의 짝수의 합을 구하는 클래스
 * 
 * @author Administrator
 *
 */
public class SumOfEven {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		do {
			if (num % 2 == 0) {
				sum += num;
			}
			num++;
		} while (num <= 100);
		System.out.printf("1부터 100사이 짝수의 합은 %d입니다.%n", sum);
	}

}
