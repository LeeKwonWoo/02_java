package practice.methods;

public class MethodsTest {

	public static void main(String[] args) {
		// 1. 메소드 정의 클래스 VarietyMethods 의
		//    변수 선언
		VarietyMethods methods;
		
		// 2. 초기화
		methods = new VarietyMethods(); 
		
		// 3. 사용.
		methods.sayHello();
		methods.maxims("홍길동", "호부호형을 못하니...");
		methods.maxims("소크라테스", "Know Yourself");
		methods.maxims("피터사간", "모든 사람은 두 종류의 "
								 + "고통중에서 선택해야 한다."
								 + "훈련하는 고통이거나 후회하는 고통이거나");
		
		double cel = methods.fahToCel(100.0);
		System.out.println("cel=" + cel);
		methods.birthYearMonth(1996, 8, "이권우");
		methods.printNineNineTable(9);
		int[] array = {1,2,3,4,5};
		
		methods.printNineNineTableArray(array);
		System.out.println(methods.calcBmi(200.0,90.0)+"입니다.");
		System.out.println("1과 2중 작은 수는"+methods.min(1,2));
		System.out.println("1과 2중 큰 수는"+methods.max(1,2));
		System.out.println("배열의 합은"+methods.sumOfArray(array));
		System.out.println("배열의 합의 평균은"+methods.avgOfArray(array));
		methods.adder(1, 2,'+');
		System.out.println(methods.arithmetic(1.0,1.0,'+')+"입니다.");
	}

}