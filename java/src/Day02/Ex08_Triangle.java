package Day02;

import java.util.Scanner;

public class Ex08_Triangle {

		public static void main(String[] args) {
			
			//1.밑벽과 높이를 입력받는다
			//2. 밑별과 높이를 담을 변수를 선언
			//3. 삼감형 넓이를 계산
			//4. 결과를 출력
			
			Scanner sc = new Scanner(System.in);
			
		
			
			System.out.print("밑변 : ");
			double width = sc.nextDouble();
			System.out.print("높이 : ");
			double height = sc.nextDouble();
			
			double area = width * height /2;
			
			System.out.println("넓이 : " + area);
			
			sc.close();
			
		}
	
}
