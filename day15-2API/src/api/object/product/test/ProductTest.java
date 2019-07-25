package api.object.product.test;

import api.object.product.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		// 1. 선언 : 제품을 사용하기 위한 객체 참조 변수
		Product msMouse;
		Product ltMouse;
		Product airFrier;
		Product[] products = new Product[3];
		
		// 2. 초기화
		msMouse = new Product("P001", "MS-아크 터치 마우스", 51330, 36);
		ltMouse = new Product("P003", "로지텍코리아G320", 34900, 36);
		// 객체생성은 기본생성자로 진행
		airFrier = new Product();
		
		// Product 의 각 필드에 access modifier private 인 경우
		// 반드시 수정자에 의해서만 접근 가능하다.
		airFrier.setPcode("P002");
		airFrier.setPname("[필립스] 에어프라이어 HD-9743");
		airFrier.setPrice(329000);
		airFrier.setQuantity(5);
		// 필드의 값을 가져올 때는 접근자 메소드로만 작업하도록
		System.out.println(airFrier.getPcode());
		System.out.println(airFrier.getPname());
		System.out.println(airFrier.getPrice());
		System.out.println(airFrier.getQuantity());
		
		products[0] = msMouse;
		products[1] = airFrier;
		products[2] = ltMouse;
		
		// 3. 사용
		// (1) 초기상태 출력
		for(Product product : products) {
			product.print();
		}
		// (2) ms마우스의 가격을 변경
		Product msMouse2;
		msMouse2 = new Product("P001", "MS-아크 터치 마우스", 40000, 36);
		// 제품들이 들어있는 배열 products 에서
		// msMouse 의 pcode와 같은 제품번호를 갖는 인덱스의 원소를 
		// msMouse2 로 변경
		for(int idx = 0; idx < products.length; idx++) {
			// 객체의 내용비교를 하려면 .equals()를 사용
			if(products[idx].equals(msMouse2)) {
				products[idx] = msMouse2;
				products[idx].print();
			}
		}
		
	}

}
