package lecture;
//isNew isOpen color class=Marker print use
/**
 * 마커를 정의하는 클래스
 * @author Administrator
 *
 */
public class Marker {
	/**
	 * 새 마커인지 여부 
	 * true : 새마커
	 * false : 다쓴마커
	 */
	boolean isNew;
	/**
	 * 마커의 뚜껑이 열려있는지 여부
	 * true : 뚜껑이 열려있는 상태
	 * false : 뚜껑이
	 */
	boolean isOpened;
	String color;
	// 생성자
	Marker() {
		
	}
	Marker(boolean isNew) {
		this();
		this.isNew = isNew;
	}
	Marker(boolean isNew,boolean isOpened) {
		this(isNew);
		this.isOpened = isOpened;
	}
	Marker(boolean isNew,boolean isOpened,String color) {
		this(isNew,isOpened);
		this.color = color;
	}
	// 메소드 선언
	/**
	 *  ~ 색의 마커를 사용하고 있습니다. 라는 문장을 출력하는 메소드
	 */
	public void use() {
		System.out.println(color+"색 마커를 사용하고 있습니다.");
	}
	
	public void print() {
		if (isNew) {
			System.out.println(color+"색은 새 마커입니다.");
		} else {
			System.out.println(color+"색은 다 쓴 마커입니다.");
		}
		if (isOpened) {
			System.out.println(color+"색은 뚜껑이 열려있습니다.");
		} else {
			System.out.println(color+"색은 뚜껑이 닫혀있습니다.");
		}
	}
}
