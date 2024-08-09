package Day03;

import java.util.Scanner;

public class Ex13_Gugu {

	public static void main(String[] args) {
		
		//구구단 (1~9단)
		// 원하는 단을 입력받아 구구단 수식을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int input = sc.nextInt();
		
		//9회 반복
		//(입력 단) x (반복 변수 : 1~9) = 결과
		for (int i = 1; i <= 9; i++ ) {
			int result = input * i;
			System.out.println(input + "x" + i + "=" + result);
		}
		sc.close();
		
	}
	
}
