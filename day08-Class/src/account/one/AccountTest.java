package account.one;
/**
 * 계좌(Account 타입) 클래스의
 * 인스턴스(객체, 실체) 를 생성하고
 * 입금기능, 현재 계좌 상태 출력기능등을
 * 테스트하는 클래스
 * @author Administrator
 *
 */
public class AccountTest {

	public static void main(String[] args) {
		// 1.선언
		Account account;
		Account myaccount;
		// 2. 초기화
		account = new Account();
		myaccount = new Account();
		// 3. 사용
		System.out.println("Account의 상태");
		
		
		
		
		
		// (1) 계좌 생성 직후 상태 출력
		account.print();
		// (2) 계좌에 10,000원 입금
		account.deposit(10000);
		// (3) 입금 후 상태 출력
		account.print();
		// (4) 계좌에 5,000원 입금
		account.deposit(5000);
		// (5) 입금 후 상태 출력
		account.print();
		System.out.println("=================================");
		System.out.println("MyAccount의 상태");
		
		// (1) 계좌 생성 직후 상태 출력
		myaccount.print();
		// (2) 계좌에 10,000원 입금
		myaccount.deposit(100000);
		// (3) 입금 후 상태 출력
		myaccount.print();
		// (4) 계좌에 5,000원 입금
		myaccount.deposit(5000);
		// (5) 입금 후 상태 출력
		myaccount.print();
	}

}
