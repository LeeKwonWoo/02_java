package account.two;
/**
 * 계좌(Account 타입) 클래스의
 * 인스턴스(객체, 실체)를 생성하고
 * 
 * 이 때, 중복정의된 생성자를 사용해서
 * 실체화를 진행하며
 * 그렇게 생성된 객체에 테스트하는 클래스
 * @author Administrator
 *
 */
public class AccountTest {

	public static void main(String[] args) {
		// 1. 선언
		Account myAccount;
		Account youtAccount;
		Account hisAccount;
		// 2. 초기화
		// (1) 기본생성자로 초기화
		myAccount = new Account();
		// (2) 매개변수를 받는 중복정의된 생성자로 초기화
		youtAccount = new Account(1,10000);
		
		hisAccount = new Account("2",30000);
		// 3. 사용
		// (1) 계좌생성되자 마자 초기 상태 출력
		myAccount.print();
		youtAccount.print();
		hisAccount.print();
		
		// (2) 입금 : 1000원 : 두 계좌에 모두
		
		myAccount.deposit(1000);
		youtAccount.deposit(1000);
		// (3) 출력 : 두 계좌 모두 출력
		myAccount.print();
		youtAccount.print();
		// (4) 입금 : 5000원
		myAccount.deposit(5000);
		youtAccount.deposit(5000);
		// (5) 출력 : 두 계좌 모두
		myAccount.print();
		youtAccount.print();
		// (6) 출금 : 4000원
		System.out.println(myAccount.withdraw(7000));
		System.out.println(youtAccount.withdraw(4000));
		// (7) 출력 : 두 계좌 모두 출력
		myAccount.print();
		youtAccount.print();
	}

}
