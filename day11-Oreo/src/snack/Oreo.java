package snack;
/**
 * Oreo 쿠키를 정의하는 클래스
 * ---------------------------
 * 속성 : 
 *     cream : String : 바닐라, 초코, 딸기, 말차
 *    radius : double :오래오 쿠키 1개의 반지름 길이
 * thickness : double : 오레오쿠키 1개의 두께
 * ------------------------------------------------
 * 생성자 : 기본 생성자, 중복된 this,this()로 정의하는 생성자
 * 총 4개의 생성자 중복정의
 * 메소드 :
 * print() : void() : 오레오쿠키의 상태 출력
 * changeCream(String cream) : void : 매개변수로 입력된 cream 값으로 오레오 쿠키의 크림을 변경함
 * @author Administrator
 *
 */
public class Oreo {
	// 멤버변수 선언
	// 쿠키 일련번호
	int seq;
	String cream;
	double radius;
	double thickness;
	//생성자 선언
	Oreo() {
		
	}
	Oreo(int seq) {
		this.seq = seq;
	}
	Oreo(int seq,String cream) {
		this(seq);
		this.cream = cream;
	}
	Oreo(int seq,String cream,double radius) {
		this(seq,cream);
		this.radius = radius;
	}
	Oreo(int seq,String cream,double radius,double thickness) {
		this(seq,cream,radius);
		this.thickness = thickness;
	}
	//메소드 선언
	public void print() {
		System.out.println("seq:"+seq+"는"+cream+"크림 쿠키의 반지름은"+radius+" 두께는"+thickness+" 입니다.");
	}
	public void changeCream(String cream) {
		System.out.println(this.cream+"는 "+cream+"로 변경 되었습니다.");
		this.cream = cream;
	}
	
	//접근자 수정자 getter/setter
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	public String getCream() {
		return cream;
	}
	public void setCream(String cream) {
		this.cream = cream;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getThickness() {
		return thickness;
	}
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
}
