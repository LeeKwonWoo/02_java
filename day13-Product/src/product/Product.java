package product;
/**
 * 전자제품을 판매하는 매장에서
 * 관리하는 대상인 "제품"을 정의하는 클래스
 * -----------------------------------------
 * 멤버변수(private,protected,public붙이지 말것)
 * 제품번호 : pcode    : String : P001
 * 제품명   : pname    : String : 삼성 지펠 ... 상세한명칭하이마트 가서 알아보기
 * 가격     : price    : int    : 진짜 그 제품 가격
 * 재고수향	: quantity : int	
 * -----------------------------------------
 * 생성자(public)
 * 기본생성자, 매개변수 생성자는 생성자 필드 1씩 늘려가며
 * this, this()사용
 * -----------------------------------------
 * 메소드 정의(public)
 * print() : void : 제품의 상태를 출력
 * toString() : String : 이 제품을 대표하는 문자여을 리턴 String.format()으로 리턴
 * discount(double percenttage): int : 입력된 퍼센트만큼 할인된 가격을 리턴
 * sell(int amount) : void : 매장에서 판매되어 재고수량quantity이 amount만큼 줄어들도록 반영 0보다 안작아짐
 * buy(int amount) : void : 매장에 입고 되어 제고수량qauntity이 amount만큼 늘어나도록 반영
 * -----------------------------------------
 * 주의사항
 * 각 필드를 선언 할떄 필드에 대한 설명을 문서주석으로 달것
 * 각 생성자 선언 할때 문서주석달것
 * 각 메소드 선언할떄 문서주석으로 달것
 * @author Administrator
 *
 */
public class Product {
	/**제품번호*/
	String pcode;
	/**제품명*/
	String pname;
	/**가격*/
	int price;
	/**재고수량*/
	int quantity;
	/**
	 * 기본생성자
	 */
	public Product() {
		
	}
	/**
	 * 필드인 pcode를 초기화하는 생성자
	 * @param pcode : String : 제품코드
	 */
	public Product(String pcode) {
		this();
		this.pcode = pcode;
	}
	/**
	 * pname을 초기화하는 생성자
	 * @param pcode : String : 제품코드
	 * @param pname : String : 제품명
	 */
	public Product(String pcode,String pname) {
		this(pcode);
		this.pname = pname;
	}
	/**
	 * price를 초기화하는 생성자
	 * @param pcode : String : 제품코드
	 * @param pname : String : 제품명
	 * @param price : int	 : 가격
	 */
	public Product(String pcode,String pname,int price) {
		this(pcode,pname);
		this.price = price;
	}
	/**
	 * quantity를 초기화하는 생성자
	 * @param pcode 	: String : 제품코드
	 * @param pname 	: String : 제품명
	 * @param price 	: int	 : 가격
	 * @param quantity	: int 	 : 재고수량
	 */
	public Product(String pcode,String pname,int price,int quantity) {
		this(pcode,pname,price);
		this.quantity = quantity;
	}
	/**
	 * 제품의 정보를 출력해주는 메소드
	 */
	public void print() {
		System.out.println(this);
	}
	/**
	 * 제품의 정보를 문자열로 리턴해주는 메소드
	 */
	public String toString() {
		return String.format("이 제품은 %s %s고, 가격:%d , 재고수량:%d 입니다.",pcode, pname,price,quantity);
	}
	/**
	 * 매장에서 판매되어 재고수량이 줄어드는 메소드
	 * @param amount
	 */
	public void sell(int amount) {
		if(this.quantity > 0) {
			this.quantity -= amount;
		}
	}
	/**
	 * 매장에 입고되어 재고수량이 늘어나는 메소드
	 * @param amount
	 */
	public void buy(int amount)	 {
		this.quantity += amount;
	}
	/**
	 * 입력된 퍼센트만큼 할인된 가격을 리턴해주는 메소드 
	 * @param percenttage
	 * @return
	 */
	public int discount(double percenttage) {
		this.price = (int)(this.price * (1-percenttage));
		return this.price;
	}
	
}
