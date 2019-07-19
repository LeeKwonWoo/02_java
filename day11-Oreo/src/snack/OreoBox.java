package snack;
/**
 * 오레오쿠키가 여러개 들어가있는 박스
 * @author Administrator
 *
 */
public class OreoBox {
	// Oreo 여러개 저장할수 있는
	// Oreo[] oreos 를 멤버 변수로 갖도록 선언
	Oreo[] oreos;
	// 생성자 기본 , 매개변수 중복정의
	OreoBox() {
		
	}
	OreoBox(Oreo[] oreos) {
		this.oreos = oreos;
	}
	// 메소드 d오레오 쿠키를 1개씩 추가, 삭제, 수정, 꺼냄
	public void add(Oreo oreo) {
		Oreo[] newOreos = new Oreo[oreos.length+1];
		for (int idx = 0; idx < oreos.length; idx++) {
			newOreos[idx] = oreos[idx];
		}
		newOreos[oreos.length] = oreo;
		this.oreos = newOreos;
	}
	public void remove(Oreo oreo) {
		int index = -1;
		Oreo[] newOreos;
		for(int idx = 0; idx < oreos.length; idx++) {
			if(oreos[idx].seq == oreo.seq) {
				index = idx;
			}
		}
		
		if (index > -1) {
			newOreos = new Oreo[oreos.length-1];
			if (index < oreos.length - 1) {
				for(int idx = 0; idx < index; idx++) {
					newOreos[idx] = oreos[idx];
				}
				for(int idx = 0; idx < newOreos.length; idx++) {
					newOreos[idx] = oreos[idx+1];
				}
			} else {
				for (int idx= 0; idx < oreos.length - 1; idx++) {
					newOreos[idx] = oreos[idx];
				}
			}
			this.oreos = newOreos;
		}
		
	}
	public void set(Oreo oreo) {
		int index = -1;
		for(int idx = 0; idx < oreos.length; idx++) {
			if(oreos[idx].seq == oreo.seq) {
				index = idx;
				break;
			}
		}
		if(index > -1) {
			oreos[index] = oreo;
		}
	}
	public Oreo get(Oreo oreo) {
		Oreo findOreo = null;
		for(int idx = 0; idx < oreos.length; idx++) {
			if(oreos[idx].seq == oreo.seq) {
				findOreo = oreos[idx];
			}
		}
		return findOreo;
	}
	public Oreo[] getAllOreo() {
		return oreos;
	}
}
