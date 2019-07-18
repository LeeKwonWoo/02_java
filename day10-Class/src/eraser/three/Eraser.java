package eraser.three;

/**
 * 칠판 지우개를 정의하는 클래스
 * -----------------------------
 * 지우개 일련 번호 부여를 위한 클래스 변수
 * count를 선언하고 0으로 초기화
 * ------------------------------
 * 칠판 지우개 속성 정의 -> 멤버변수로 생성
 * 
 * 지우개 일련번호 :serial : int
 * 가로 : width  : double
 * 세로 : height : double
 * 높이 : depth  : double
 * 겹	: layer  : int
 * 색상	: color  : String
 * ------------------------------
 * 생성자 정의
 * 기본생성자 명시
 * :ㅅ기본생성자에서 serial 변수에ㅐ 증가된 count 변수의 값을 저장
 * 매개변수를 받는 생성자 : 모든 필드를 다 받도록 정의
 * 생성자 리팩토링(1)
 * 							: this 키워드를 사용하여 매개변수 생성자 정의
 * 생성자 리팩토링(2)
 * 						: this() 다른생성자 호출 적용하여 생성자를 여러개 중복정의
 * ------------------------------------------------------
 * 기능 정의 : 메소드로 생성
 * 칠판지우기  : erase() : void : "칠판을 지웠습니다." 문자열 출력
 * 한 겹씩 제거 : peel() : void : 현재 layer 값에서 1 감소 layer가 0이 될 떄 까지 0이면 1감소안됨
 * 지우개 상태 출력 : print() : void : 현재지우개의 가로 세로,높이,겹,색상등의 상태를 출력
 * @author Administrator
 *
 */
public class Eraser {
	 static int count = 0;
	// 1. 멤버변수 선언부
	 int serial = 0;
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
		this.serial = ++count;
	}
	// (2) 매개변수가 있는 생성자
	/**
	 * 지우개의 가로필드만 초기화 생성자
	 * @param width : 가로길이 => 직접초기화
	 */
	Eraser(double width) {
		this(); // 기본생성자 호출 매개변수가 비어있는 this()이므로
		//width 필드는ㄴ 매개벼누로 넘겨진 값으로 초기화
		
		this.width = width; 
	}
	/**
	 * 지우개의 가로, 세로 필드만 초기화하는 생성자
	 * @param width :가로길이 => width 필드를 초기화하는 생성자의 기능을 사용 위의width부름
	 * @param height :세로길이 => 직접초기화
	 */
	Eraser(double width,double height) {
		this(width);
		this.height = height;
	}
	/**
	 * 지우개의 가로,세로,높이 필드를 초기화하는 생성자
	 * @param width :가로길이=>매개변수 2개받는 생성자로 초기화
	 * @param height:세로길이=>매개변수 2개받는 생성자로 초기화
	 * @param depth :높이 = > 직접초기화
	 */
	Eraser(double width,double height,double depth) {
		this(width,height);
		this.depth = depth;
	}
	/**
	 * 지우개의 가로,세로,높이,겹 필드를 초기화하는 생성자
	 * @param width :가로길이=>매개변수 3개받는 생성자로 초기화
	 * @param height:세로길이=>매개변수 3개받는 생성자로 초기화
	 * @param depth :높이 = > 매개변수 3개받는 생성자로 초기화
	 * @param layer : 겹 => 직접초기화
	 */
	Eraser(double width,double height,double depth,int layer) {
		this(width,height,depth);
		this.layer = layer;
	}
	
	/**
	 * 지우개의 가로,세로,높이,겹,색 필드를 초기화하는 생성자
	 * @param width :가로길이=>매개변수 3개받는 생성자로 초기화
	 * @param height:세로길이=>매개변수 3개받는 생성자로 초기화
	 * @param depth :높이 = > 매개변수 3개받는 생성자로 초기화
	 * @param layer : 겹 => 매개변수 3개받는 생성자로 초기화
	 * @param color : 색 => 직접 초기화
	 */
	
	Eraser(double width,double height,double depth,int layer,String color) {
		this(width,height,depth,layer);
		this.color = color;
	}
	// 3. 메소드 선언부
	public void erase() {
		System.out.println(serial+"번 지우개가 칠판을 지웠습니다.");
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
		System.out.printf("번호:%d 지우개는 가로:%4.2f, 세로:%4.2f, 높이:%4.2f, 남은 겹: %d, 색:%s%n",serial,width,height,depth,layer,color);
	}
}
