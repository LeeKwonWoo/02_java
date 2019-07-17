package lecture;

/**
 * 마커 와 칠판지우개 를 사용하여 마커를 쓰고 지우개로 지워보는 테스트 클래스
 * 
 * @author Administrator
 *
 */
public class LectureTest {

	public static void main(String[] args) {
		// 1. 선언
		Eraser rightEraser;
		Eraser leftEraser;
		Marker red;
		Marker blue;
		Marker green;
		Marker black;
		// 2. 초기화
		leftEraser = new Eraser(3.5, 12.0, 5.5, 5, "검은색","왼쪽");
		rightEraser = new Eraser(3.5, 12.0, 5.5, 3, "흰색","오른쪽");
		red = new Marker(true,false,"빨간");
		blue = new Marker(true,false,"파란");
		green = new Marker(true,false,"초록");
		black = new Marker(true,false,"검은");
		
		// 3. 사용
		// (1) 네개의 마커를 한번씩 사용
		red.print();
		blue.print();
		green.print();
		black.print();
		// (2) 오른쪽,왼쪽 지우개로 사용한 내용 지우기
		leftEraser.erase();
		rightEraser.erase();
		// (3) 오른쪽 지우개 한겹 벗겨내기
		rightEraser.peel();
		// (4) 오른쪽 지우개 상태 출력
		rightEraser.print();
	}

}
