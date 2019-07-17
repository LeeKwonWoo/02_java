package eraser.two;

/**
 * 칠판 지우개를 정의하는 클래스
 * ------------------------------
 * 칠판 지우개 속성 정의 -> 멤버변수로 생성
 * 가로 : width  : double
 * 세로 : height : double
 * 높이 : depth  : double
 * 겹	: layer  : int
 * 색상	: color  : String
 * ------------------------------
 * 생성자 정의
 * 기본생성자 명시
 * 매개변수를 받는 생성자 : 모든 필드를 다 받도록 정의
 * 							: this 키워드를 사용하여 매개변수 생성자 정의
 * ------------------------------------------------------
 * 기능 정의 : 메소드로 생성
 * 칠판지우기  : erase() : void : "칠판을 지웠습니다." 문자열 출력
 * 한 겹씩 제거 : peel() : void : 현재 layer 값에서 1 감소 layer가 0이 될 떄 까지 0이면 1감소안됨
 * 지우개 상태 출력 : print() : void : 현재지우개의 가로 세로,높이,겹,색상등의 상태를 출력
 * @author Administrator
 *
 */
public class Eraser {
	 
	// 1. 멤버변수 선언부
	/**지우개 가로길이*/
	double width;
	/**지우개 세로길이*/
	double height;
	/**지우개 높이*/
	double depth;
	/**지우개 겹*/
	int layer;
	/**지우개 색*/
	String color;
	// 2. 생성자 선언부
	// (1) 기본생성자
	/**
	 * 지우개 클래스의 기본생성자
	 */
	Eraser() {
		
	}
	// (2) 매개변수가 있는 생성자
	/**
	 * 
	 * @param newWidth
	 * @param newHeight
	 * @param newDepth
	 * @param newLayer
	 * @param newColor
	 */
	Eraser(double width,double height,double depth,int layer,String color) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.layer = layer;
		this.color = color;
	}
	// 3. 메소드 선언부
	public void erase() {
		System.out.println("칠판을 지웠습니다.");
	}
	/**
	 * 남아 있는 지우개 겹을 벗겨내는 메소드
	 * layer 값이 0보다 작을 수는 없다.
	 */
	public void peel() {
		if (layer > 0) {
			layer--;
		}
	}
	public void print() {
		System.out.printf("가로:%4.2f, 세로:%4.2f, 높이:%4.2f, 남은 겹: %d, 색:%s%n",width,height,depth,layer,color);
	}
}
