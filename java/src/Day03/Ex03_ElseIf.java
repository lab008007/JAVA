package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적 : ");
		
		int score = sc.nextInt();
		
		if( score >= 90 && score <= 100 ) System.out.println("A");
		if( score >= 80 && score < 90 ) System.out.println("B");
		if( score >= 70 && score < 80 ) System.out.println("C");
		if( score >= 60 && score < 70 ) System.out.println("D");
		if( score < 60 && score >= 0 ) System.out.println("F");
		
		
		/*
		 *if( score >= 90 && score <= 100 )
		 *grade = 'A';
		 *else if( score >= 80 )
		 *grade = 'B';
		 *else if( score >=70 )
		 *grade = 'C';
		 *
		 *
		 */
		
		
		
		sc.close();
		
	}
	
}
