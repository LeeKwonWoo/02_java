package book.resp;

public class MessageResp implements Response {
	
	/**
	 * 데이터를 입력, 수정, 삭제 등의 작업 후
	 * 성공 여부에 대한 메시지가 발생했을 떄
	 * 그 메시지를 출력
	 */
	@Override
	public void response(Object object) {
		String message = (String)object;
		System.out.println(message);
	}

}
