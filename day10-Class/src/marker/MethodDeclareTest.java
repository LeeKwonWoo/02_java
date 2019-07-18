package marker;
public class MethodDeclareTest {
	public static void main (String[] args) {
		MethodDeclare method = new MethodDeclare();
		method.convertStringToCharArray("swap");
		System.out.println();
		method.sortLetters("Hello, World!");
		method.sortLetters("안녕하세요, 자바!");
	}

}