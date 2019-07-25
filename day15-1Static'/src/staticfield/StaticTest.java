package staticfield;

/**
 * static 과 non-static 사이의 호출 관계를 테스트하는 클래스
 * @author Administrator
 *
 */
public class StaticTest {

	public static void main(String[] args) {
		// 1. StaticInit 클래스의 static 변수
		System.out.println("StaticInit.count="+StaticInit.count);
		// 2. static 클래스의 static 메소드 사용
		StaticInit.increaseCount();
		// 1. 선언 // 2. 초기호ㅓㅏ
 		StaticInit init = new StaticInit();
		// 3. ㅅㅏ용
 		init.setMemberCnt(10);
		System.out.println("memberCnt + count = " + init.addCount());
		// 4. print() 
		StaticInit.print();
		StaticInit.print(init);
	}

}
