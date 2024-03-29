package practice.methods;
public class Test {
	public static void main(String[] args) {
		MethodPractice practice = new MethodPractice();
		
		// 1.
		System.out.printf("-1 = |%d|%n",practice.absolute(-1));
		
		
		// 2.
		practice.findMultiple(4);
		
		// 3.
		System.out.printf("3 = %s%n",practice.decideSign(3));
		
		// 4.
		practice.repeatedMessage("Hello",5);
		
		// 5.
		System.out.println("Area = "+practice.calcCircleArea(3));
		
		// 6.
		int[] array = new int[20];
		array = practice.makeMultipleNums(5);
		for(int idx = 0; idx < array.length; idx++) {
			System.out.printf("%d,",array[idx]);
		}
	}
	
	
}