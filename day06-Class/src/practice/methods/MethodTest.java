package practice.methods;

public class MethodTest {
	public static void main(String[] args) {
		MethodDefinitions methods;
		
		methods = new MethodDefinitions();
		String msgresult;
		int result;
		double result2;
		//1.
		methods.printTen(10);
		//2.
		methods.printSomebodyMessage("Hello","kwonwoo");
		//3.
		methods.printMeesage("Hello");
		//4.
		msgresult = methods.returnOriginalMessage("Hello");
		System.out.println("Message:"+msgresult);
		
		//5.
		result = methods.addTen(10);
		System.out.println("result:"+result);
		
		//6.
		result = methods.addTen(10);
		System.out.println("result:"+result);
		
		//7.
		
		result2 = methods.addTen(10);
		System.out.println("result:"+result2);
		//8.
		result2 = methods.addTen(10);
		System.out.println("result:"+result2);
		
		//9.
		msgresult = methods.makeFullName("kwonwoo","Lee");
		System.out.println("FullName"+msgresult);
		
		//10.
		result = methods.add(1,2);
		System.out.println("result:"+result);
		
		//11.
		result2 = methods.add(1,2);
		System.out.println("result:"+result2);
		
		//12.
		methods.printMsgManyTimes("Hello",5);
		
		//13.
		methods.arithmetic(2,2,'+');
		methods.arithmetic(2,2,'-');
		methods.arithmetic(2,2,'*');
		methods.arithmetic(2,2,'/');
		
		
		//14.
		result2 = methods.arithmetic(2.0,2.0,'+');
		System.out.println("result:"+result2);
		result2 = methods.arithmetic(2.0,2.0,'-');
		System.out.println("result:"+result2);
		result2 = methods.arithmetic(2.0,2.0,'*');
		System.out.println("result:"+result2);
		result2 = methods.arithmetic(2.0,2.0,'/');
		System.out.println("result:"+result2);
		
		//15.
		methods.isEven(2);
	}
}