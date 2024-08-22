package Day10.Ex03_Wrapper;

public class CompareValue {

	public static void main(String[] args) {
		
		Integer intObj1 = 10;
		Integer intObj2 = 10;
		
		System.out.println("언박싱하여 비교");
		System.out.println("결과 : " + (intObj1.intValue() == intObj2.intValue()));
		
		//Q. intObj1객체와 intObj2객체의 인스턴스가 같은가?
		//A. byte 범위 앝에서는 같은 레퍼런스(인스털스)로 생성된다.
		//*byte(8bits) - (0128~127)범위에서는 같은 인스턴스가 된다.
		System.out.println("레퍼런스 비교");
		System.out.println("결과 : " + (intObj1 == intObj2));
		
		System.out.println("equals()로 비교");
		System.out.println("결과 : " + (intObj1.equals(intObj2)));
		
		System.out.println("-------------------------------------");
		
		Integer intObj3 = 200;
		Integer intObj4 = 200;
		
		System.out.println("언박싱하여 비교");
		System.out.println("결과 : " + (intObj3.intValue() == intObj4.intValue()));
		
		System.out.println("레퍼런스 비교");
		System.out.println("결과 : " + (intObj3 == intObj4));
		
		System.out.println("equals()로 비교");
		System.out.println("결과 : " + (intObj3.equals(intObj4)));
		
		// ==, != 기호로 Wrapper 클래스 객체를 비교하면,
		// 아래의 범위에서는 배부의 값을 ==, != 로 비교할 수 있다.
		// Boolean   : true, false
		// 정수 타입    : -128 ~ 127
		// Character  : u0000 ~ \u007f
		
		Boolean a = true; // new Boolean(true)
		Boolean b = true; // new Boolean(true)
		
		System.out.println( a == b );
		
	}
	
}
