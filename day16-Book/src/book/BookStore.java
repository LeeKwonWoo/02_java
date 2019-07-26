package book;
/**
 * 책을 판매하는 서점을 정의하는 클래스
 * 서점에서 도서판매를 위해서 최소 1명의
 * 매니저는 있어야한다.
 *  * ===============================================================
 * 1. 캡슐화 적용 : 멤버변수 private
 * 					생성자, 메소드는 public
 * @author Administrator
 *
 */
public class BookStore {
	// 1. 멤버 변수
	private BookManager manager;
	// 2. 생성자
	public BookStore() {
		manager = new BookManager();
	}
	public BookStore(BookManager manager) {
		this.manager = manager;
	}
	// 3. 메소드 선언
	// (1)서점에 신간이 들어왔을 때
	//    매니저에게 신간 정리(책장에 꼽는 것 등을 부탁)
	public void add(Book book) {
		manager.add(book);
	}
	// (2) 서점에서 폐기할 도서가 생겼을 때
	//     매니저에게 폐기 부탁
	public void remove(Book book) {
		manager.remove(book);
	}
	// (3) 서점에서 판매 도서의 가격등 변동이 있을 때
	//     매니저에게 가격 태그 등 책 정보 수정을 부탁함
	public void set(Book book) {
		manager.set(book);
	}
	// (4) 서점에 온 고객이 책을 찾을 떄
	//     매니저에게 찾아달라고 부탁함
	public Book get(Book book) {
		return manager.get(book);
	}
	// (5) 우리 서점에서 판매하는 모든 책의 목록을
	//     매니저에게 출력해달라고 부탁함.
	public void getAllBooks() {
		manager.getAllBooks();
	}
}
