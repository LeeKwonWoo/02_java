package practice.methods;

public class MethodDefinitions {
	// 1.
	public void printTen(int input) {
		for (int idx = 10; idx <= 100; idx+=10) {
			System.out.printf("%d%n",input+idx);
		}
	}
	// 2.
	public void printSomebodyMessage(String message, String name) {
		System.out.printf("[%s]:%s%n",name,message);
	}
	// 3.
	public void printMeesage(String message) {
		System.out.printf("%s%n",message);
	}
	// 4.
	public String returnOriginalMessage(String message) {
		return message;
	}
	// 5.
	public int addTen(int input) {
		input = input + 10;
		return input;
	}
	// 6.
	public int subtractTen(int input) {
		input = input - 10;
		return input;
	}
	// 7.
	public double makeDouble(double input) {
		input = input * 2;
		return input;
	}
	// 8.
	public double subtractFivePointFive(double input) {
		input = input - 5.5;
		return input;
	}
	// 9.
	public String makeFullName(String name,String surname) {
		String fullname;
		fullname = surname + name;
		return fullname;
	}
	// 10.
	public int add(int x, int y) {
		int result = x + y;
		return result;
	}
	// 11.
	public double add(double x, double y) {
		return x+y;
	} 
	// 12.
	public void printMsgManyTimes(String message, int input) {
		for (int idx = 0; idx < input; idx++) {
			System.out.printf("%s \t current:%d",message,idx);
		}
	}
	// 13.
	public void arithmetic (int x, int y, char op) {
		if (op == '+') {
			System.out.printf("%d %c %d = %d",x,op,y,x+y);
		} else if (op == '-') {
			System.out.printf("%d %c %d = %d",x,op,y,x-y);
		} else if (op == '*') {
			System.out.printf("%d %c %d = %d",x,op,y,x*y);
		} else if (op == '/') {
			System.out.printf("%d %c %d = %d",x,op,y,x/y);
		}
	}
	// 14.
	public double arithmetic (double x, double y, char op) {
		if (op == '+') {
			return x+y;
		} else if (op == '-') {
			return x-y;
		} else if (op == '*') {
			return x*y;
		} else if (op == '/') {
			return x/y;
		} else {
			return 0;
		}
	}	
	// 15.
	public boolean isEven (int input) {
		if (input % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}