package control.loop;
/**
 * while 문을 이용하여 1~100 사이의 홀수의 합을 구하는 클래스
 * 
 * @author Administrator
 *
 */
public class SumOfOdds {

	public static void main(String[] args) {
		int num= 1;
		int sum = 0;
		
		do {
			if(num%2==1) {
				sum += num;	
			}
			num++;
		} while (num <= 100);
		System.out.printf("1부터 100 사이 홀수의 합은 %d 입니다.%n",sum);
	}

}
