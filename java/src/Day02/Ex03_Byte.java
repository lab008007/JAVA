package Day02;

public class Ex03_Byte {
	
	public static void main(String[] args) {
		
	
		//1byte = 8bits : 2^8=256개
	  	// 양수와 음수로 나누면, -128~0~127 범위로 표현
	byte var1 = -128;
	byte var2 = -30;
	byte var3 = 0;
	byte var4 = 30;
	byte var5 = (byte) 128; //강제형변환
	// 자료형(타입) 불일치, 데이터 범위 벗어남
	
	System.out.println("var1 : " + var1);
	System.out.println("var2 : " + var2);
	System.out.println("var3 : " + var3);
	System.out.println("var4 : " + var4);
	System.out.println("var5 : " + var5);
	
	}
}
