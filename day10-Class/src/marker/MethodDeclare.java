package marker;
public class MethodDeclare {
	// 1.
	public void convertStringToCharArray(String input) {
		char[] letters;
		letters = new char[input.length()];
		for (int idx = 0; idx < letters.length; idx++) {
			letters[idx] = input.charAt(idx);
		}
		for (char letter : letters) {
			System.out.printf("%c",letter);
		}
	}
	// 2.
	public char[] sortLetters(String input) {
		char[] letters;
		char temp = ' ';
		letters = new char[input.length()];
		for (int idx = 0; idx < letters.length; idx++) {
			letters[idx] = input.charAt(idx);
		}
		for (int idx = 0; idx < letters.length; idx++) {
			for (int idn = idx + 1; idn < letters.length; idn++) {
				if(letters[idx] > letters[idn]) {
					temp = letters[idx];
					letters[idx] = letters[idn];
					letters[idn] = temp;
				}
			}
		}
		for (int idx = 0; idx < letters.length; idx++) {
			System.out.printf("%c",letters[idx]);
		} 
		return letters;
	}
}