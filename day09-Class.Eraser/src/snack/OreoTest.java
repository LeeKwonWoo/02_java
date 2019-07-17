package snack;
/**
 * Oreo 쿠키가 3개 들어있는
 * oreoBox 라는 변수를 Oreo 배열타입으로 선언하고
 * oreoBox[0] <== 바닐라,초코,딸기
 * 상태
 * for모든쿠키의 크림을 바닐라로 변경
 * 변경후 상태확인
 * @author Administrator
 *
 */
public class OreoTest {

	public static void main(String[] args) {
		Oreo[] oreocookies = new Oreo[3];
		oreocookies[0] = new Oreo("바닐라",3.0,1.0);
		oreocookies[1] = new Oreo("초코",3.5,1.5);
		oreocookies[2] = new Oreo("딸기",3.3,1.3);
		for (Oreo oreo : oreocookies) {
			oreo.print();
		}
		for (int idx = 0; idx < oreocookies.length; idx++) {
			oreocookies[idx].changeCream("바닐라");
		}
		for (Oreo oreo : oreocookies) {
			oreo.print();
		}
	}

}
