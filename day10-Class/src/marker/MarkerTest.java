package marker;
/**
 * 마커를 만들고
 * 사용해 보는 클래스
 * @author Administrator
 *
 */
public class MarkerTest {

	public static void main(String[] args) {
		// 1. 선언
		Marker leftMarKer;
		Marker rightMarKer;
		// 2. 초기화
		leftMarKer = new Marker(true,false,"Yellow");
		rightMarKer = new Marker(true,false,"Green");
		// 3. 사용
		// 두 개의 마커의 현재상태출력
		leftMarKer.print();
		rightMarKer.print();
		System.out.println("-----------------------------");
		// 왼쪽마커 사용
		leftMarKer.use();
		// 두 개의 마커의 현재상태출력
		leftMarKer.print();
		rightMarKer.print();
		System.out.println("-----------------------------");
		// 오른쪽마커 사용
		rightMarKer.use();
		// 두 개의 마커의 현재상태출력
		leftMarKer.print();
		rightMarKer.print();
		System.out.println("-----------------------------");
	}

}
