package lecture;
/**
 * 2개의 지우개와 4개의 마커를 배열을 사용하여 사용/관리하는 테스트 클래스
 * -----------------------------------------------------------------------
 * 1. 마커 배열 선언
 *    지우개 배열 선언
 * 2. markers 는 길이 4
 *    erasers 는 길이 2
 * 3. foreach 를 사용하여
 * (1) 모든 마커를 한번씩 사용(use())
 * (2) 모든 지우개를 한번씩 사용(erase())
 * (3) 모든 지우개를 한번씩 한겹 벗겨내기(peel())
 * (4) 모든 지우개의 상태 출력
 * (5) 모든 머커의 상태 출력
 * @author Administrator
 *
 */

public class LectureTestByArray {

	public static void main(String[] args) {
		// 1. 선언
		Eraser[] erasers;
		Marker[] markers;
		// 2. 초기화
		erasers = new Eraser[2];
		markers = new Marker[4];
		//값넣기 for
		erasers[0] = new Eraser(3.5, 12.0, 5.5, 5, "검은색","왼쪽");
		erasers[1] = new Eraser(3.5, 12.0, 5.5, 3, "흰색","오른쪽");
		markers[0] = new Marker(true,false,"빨간");
		markers[1] = new Marker(true,false,"초록");
		markers[2] = new Marker(true,false,"파란");
		markers[3] = new Marker(true,false,"검은");
		// 3. 사용
		for(Marker markerTest : markers) {
			markerTest.use();
		}
		for(Eraser eraserTest : erasers) {
			eraserTest.erase();
		}
		for(Eraser eraserTest : erasers) {
			eraserTest.peel();
		}
		for(Eraser eraserTest : erasers) {
			eraserTest.print();
		}
		for(Marker markerTest : markers) {
			markerTest.print();
		}
	}

}
