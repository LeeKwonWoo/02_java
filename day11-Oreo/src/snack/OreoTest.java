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
		Oreo[] oreos = new Oreo[0];
		OreoBox box = new OreoBox(oreos);
		
		Oreo choco = new Oreo(1,"초코");
		Oreo strawberry = new Oreo(2,"딸기");
		Oreo greentea = new Oreo(3,"녹차");
		box.add(choco);
		box.add(strawberry);
		box.add(greentea);
		
		// 모두 출력
		for (Oreo oreo : box.getAllOreo()) {
			oreo.print();
		}
		// 초코쿠키를 바닐라로 변경 : set
		box.set(choco);
		// 변경된 초코쿠키 (1번쿠키) : get
		box.get(choco);
		
		// 바닐라 크림변경후
		for (Oreo oreo : box.getAllOreo()) {
			oreo.changeCream("바닐라");
		}
		// 변경후 출력
		for (Oreo oreo : box.getAllOreo()) {
			oreo.print();
		}
		
		// 3번 쿠키 삭제 : remove
		Oreo rmOreo = new Oreo(3);
		box.remove(rmOreo);
		// 전체 목록 출력
		for (Oreo oreo : box.getAllOreo()) {
			oreo.print();
		}
	}

}
