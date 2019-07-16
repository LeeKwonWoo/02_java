package practice.methods;

public class MethodPractice {
	// 1.
	public int absolute(int x) {
		return (x<0) ? -x : x;
	}
	
	// 2.
	public void findMultiple(int x) {
		int result = 0;
		int count = 1;
		
		while(result <= 100) {
			result = x * count;	
			System.out.printf("%d%n",result);
			count++;
		}
	}
	
	// 3.
	public String decideSign (int x) {
		String result;
		if (x < 0) {
			result = "minus";
		} else if (x == 0) {
			result = "0";
		} else {
			result = "plus";
		}
		return result;
	}
	
	// 4.
	public void repeatedMessage (String message, int repeat) {
		String[] messages = new String[repeat];
		for (int idx = 0; idx < messages.length; idx++) {
			messages[idx] = message;
			System.out.printf("%s",messages[idx]);
		}
	}
	
	// 5.
	public double calcCircleArea (int r) {
		return (double)r * r *3.14;
	}
	
	// 6.
	public int[] makeMultipleNums (int x) {
		int[] multiples;
		int idx = 0;
		int result = 0;
		int count = 0;
		
		
		while(result <= 100) {
			count++;
		}
		multiples = new int[count];
		
		while(result <= 100) {
			
			multiples[idx]= x * (idx+1);
			idx++;
		}
		
		return multiples;
	}

}