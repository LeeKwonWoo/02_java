package book;

import book.resp.ListResp;
import book.resp.MessageResp;
import book.resp.Response;
import book.resp.SingleResp;

/**
 * 책장(BookShelf)을 사용하는 북매니저를 나타내는 클래스
 * -----------------------------------------------------
 * 서점의 북매니저는
 * 
 * 1. 책을 책장에 꼽거나(추가하거나)
 * 2. 책장에서 찾아달라고 부탁받은 책을 가지고 오거나
 * 3. 어떤 책의 수량이나 가격정보를 수정하거나
 * 4. 더 이상 판매하지 않을 책을 폐기 하고
 * 5. 이 서점에서 파는 책 목록을 안내
 * 
 * 하는 등의 작업을 진행
 * -------------------------------------------------------
 * 전제 조건 : 북 매니저는 책장이 어디있는지, 무엇인지
 * 			   알고 있어야 한다.
 * ------------------------------------------------------
 *  * ===============================================================
 * 1. 캡슐화 적용 : 멤버변수 private
 * 					생성자, 메소드는 public
 * @author Administrator
 *
 */
public class BookManager {
	// 1. 멤버변수 선언부
	private BookShelf bookShelf;
	// 매니저가 어떤 작업후에 어떻게 응답해야 할지를 나타내는 타입
	private Response response;
	// 2. 생성자 선언부
	// (1) 기본 생성자 명시
	public BookManager() {
		bookShelf = new BookShelf();
	}
	
	// (2) 매개변수 생성자 작성
	public BookManager(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}
	
	// 3. 메소드 선언부
	// (1) 매니저는 책 한권을 책장에 가져가서
	//     새로 꼽을 수 있다.
	public void add(Book book) {
		int addCnt = this.bookShelf.add(book);
		response = new MessageResp();
		String message;
		if (addCnt > 0) {
			
			message = String.format(book.toString() + ", %d 건이 추가되었습니다.",addCnt);
			
		} else {
			
			message = String.format(book.toString() + "책 정보가 이미 존재합니다.");
			
		}
		response.response(message);
		
	}
	// (2) 매니저는 책장에 가서 더 이상 팔지 않을
	//     폐기할 책을 제거할 수 있다.
	public void remove(Book book) {
//		int removeCnt = this.bookShelf.remove(book);
//		response = new SingleResp();
//		String message;
//		if (removeCnt > 0) {
//			message = String.format(book.toString() + ", 이 책은 제거되었습니다.");
//		} else {
//			message = String.format(book.toString() + ", 이 책은 이미 제거되었습니다.");
//		}

		this.bookShelf.remove(book);
		
	}
	// (3) 매니저는 책장에서 찾아달라고 고객이 요청한
	//     책 한개를 가지고 올 수 있다.
	public Book get(Book book) {
		return this.bookShelf.get(book);
	}
	// (4) 매니저는 책장에 가서 판매 가격등
	//     책의 정보를 수정할 수 있다.
	public void set(Book book) {
		this.bookShelf.set(book);
	}
	// (5) 매니저 서점에서 판매되고 있는 책의 목록을
	//     보여 줄수 있다. 조회할 수 있다.
	public void getAllBooks() {
		response = new ListResp();
		response.response(bookShelf.getAllBooks());
	}
}
