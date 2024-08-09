package Day03;

import java.util.Scanner;

public class Ex11_DoWhile {

	public static void main(String[] args) {
		
		//메뉴판
		//변수 선언:메뉴 번호, 메뉴 이름
		int menuNo = 0;
		String menuName = "";
		int count = 0; //주문 개수
		Scanner sc = new Scanner(System.in);
		
		// do~while문
		// 무조건 1회 실행 후, 조건을 검사하여 반복하는 문장
		do {
			System.out.println("메뉴판");
			System.out.println("1. 참치마요 삼각김밥");
			System.out.println("2. 돈까스");
			System.out.println("3. 라면");
			System.out.println("4. 와퍼");
			System.out.println("5. 마라탕");
			System.out.println("0. 종료");
			System.out.print("메뉴 번호 : ");
			//메뉴 번호 입력
			menuNo = sc.nextInt();
			//break : 제어문을 탈출ㄹ하는 키워드
			// 가장 가까운 제어문만 탈출한다.
			if( menuNo == 0) break;
			//메뉴 선택
			switch (menuNo) {
				case 1: menuName = "참치마요 삼각김밥"; break;
				case 2: menuName = "돈까스"; break;
				case 3: menuName = "라면"; break;
				case 4: menuName = "와퍼"; break;
				case 5: menuName = "마라탕"; break;
				default: break;
			} 
			
			//유효성 검가
			//메뉴번호가 0~5번만 유효
			if( menuNo >= 0 && menuNo <= 5 ) {
			
			//주문 개수 증가
				count++;
			
				System.out.println(menuName + "(을/를) 주문하였습니다. ");
			} else {
				System.out.println(" (0~5)번 사이의 번호를 입력해주세요.");
			}
			//0번 입력시 메뉴판을 종료하도록
			
		} while( menuNo != 0 );
		
		//주문한 메뉴 개수를 출력하세요.
		
		System.out.println( count + "개의 메뉴를 주문하였습니다.");
		
		System.out.println("메뉴판을 종료합니다.");
		
		sc.close();
	}
	
}
