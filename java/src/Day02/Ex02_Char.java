package Day02;

public class Ex02_Char {

	public static void main(String[] args) {
		// 문자 자료형 char
		char c1 = 'A';
		char c2 = 65;         // 십진수 - 아스키코드
		char c3 = '\u0041';   //유니코드
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int unicode = c1;
		
		System.out.println("c1 : " + c1 );
		System.out.println("c2 : " + c2 );
		System.out.println("c3 : " + c3 );
		System.out.println("c4 : " + c4 );
		System.out.println("c5 : " + c5 );
		System.out.println("c6 : " + c6 );
		
		System.out.println("A의 코드값 : " + unicode);
		
		char B = (char)(c2 + 1);
		
		//(c2 + 1)  : (char)+(int) = (int) 자동형 변환
		//B = (char)(c2 +1) : (char)=(char)(int) 강제형 변환
		System.out.println("B : " + B );
	}
	
}
