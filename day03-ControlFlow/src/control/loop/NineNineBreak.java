package control.loop;

/**
 * 구구단을 중첩 for loop를 사용해서 출력 곱셈의 결과가 50을 넘으면 중단하도록 break; 구문과 for를 조합하여 테스트
 * --------------------------------------- break : 가장 가까운 반복문을 빠져나가는 역할
 * 
 * @author Administrator
 *
 */
public class NineNineBreak {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화 3. 사용
		System.out.println("==============================");
		System.out.println("== 레이블과 함께 쓰는 break ==");
		// 외부 for loop : 단을 결정
	OUT : for (int stage = 2; stage < 10; stage++) {
			// 단의 제목 출력
			System.out.printf("%n%d 단%n", stage);
			// 내부 for loop : 1~9 까지곱해지는 수를 반복
		in : for (int times = 1; times < 10; times++) {
				if (stage * times > 50) {
					break OUT;
				}
				System.out.printf("%d X %d = %2d%n", stage, times, stage * times);
			}
		}
		System.out.println("==============================");
		System.out.println("== 레이블과 함께 쓰는 break ==");
	}

}
