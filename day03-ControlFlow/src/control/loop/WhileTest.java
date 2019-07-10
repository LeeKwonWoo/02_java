package control.loop;
/**
 * 1. 50 ~ 0 까지 짝수만 역순으로 출력
 * 	  (1) continue 없이
 * 	  (2) continue 사용
 * 2. 1 ~ 10 까지 제곱표를 출력
 *    1  x  1 =  1
 *    2  x  2 =  4
 *    ...
 *    10 x 10 = 100
 * @author Administrator
 *
 */
public class WhileTest {

	public static void main(String[] args) {
		int idx = 50;
		int square = 1;
		while(idx >= 0) {
			if (idx % 2 == 0) {
				System.out.printf("%d%n",idx);
			}
			idx--;
		}
		int idx2 = 50;
		while(idx2 >= 0) {
			if (idx2 % 2 == 0) {
				continue;
			}
			System.out.printf("--%d%n",idx2);
			idx2--;
		}
		
		while(square <= 10) {
			System.out.printf("%2d X %2d = %3d%n",square,square,square * square);
			square++;
		}
	}

}
