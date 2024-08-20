package Day03;

public class Ex09_WhileSum {

	public static void main(String[] args) {
		
		//1부터 1000까지 합계
		int a = 1;
		int sum = 0 ;
		//sum = sum + a
		//        ? + 1
		//        ? + 2
		while( a <= 1000 ) {
			sum = sum + a;
			a = a + 1;
			// a++;
			// sum = sum + a++;
			// sum += a++;
		}
		System.out.println("합계 : " + sum );
		
	}
	
	
}
