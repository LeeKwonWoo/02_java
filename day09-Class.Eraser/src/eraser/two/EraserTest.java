package eraser.two;
/**
 * 칠판 지우개를 만들고
 * 사용해보는 클래스
 * @author Administrator
 *
 */
public class EraserTest {

	public static void main(String[] args) {
		// 1. 선언
		Eraser rightEraser;
		Eraser leftEraser;
		// 2. 초기화
		leftEraser = new Eraser();
		rightEraser = new Eraser(3.5,12.0,5.5,3,"흰색");
		// 3. 사용
		// (1) 두 지우개 초기 상태 출력
		leftEraser.print();
		rightEraser.print();
		// (2) 오른쪽지우개에 한 겹 제거
		rightEraser.peel();
		// (3) 두지우개 상태 출력
		leftEraser.print();
		rightEraser.print();
		// (4) 왼쪽,오른쪽 지우개 한겹 제거
		rightEraser.peel();
		leftEraser.peel();
		// (5) 왼쪽 지우개로 칠판지우기
		leftEraser.erase();
		// (6) 두 지우개 상태 출력
		leftEraser.print();
		rightEraser.print();
	}

}
