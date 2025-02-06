package practice;

import java.util.Scanner;

public class Result01 {
	/*
	 * q.1 사용자로 부터 국어, 영어, 수학 점수를 각각 입력받아 ~~~..
	 * 
	 * */
	public static void main(String[] args) {
/*		// 정수 나눗셈(int)
		int a = 7;
		int b = 3;
		int intResult = a/b;
		
		System.out.println("정수 나눗셈:" + intResult);
		
		double c = 7;
		double d = 3;
		double doubleResult = c/d;
		System.out.println("double 나눗셈" +doubleResult);
		
		// 정수 나눗셈을 캐스팅
		double mixedResult = (double)a/b;
		System.out.println("캐스팅된 나눗셈" +mixedResult);
		
		// ex
		System.out.println(4 / 3);
		System.out.println(4 / 3.0);
*/		
		//Q.01
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요.");
		System.out.print(">>>");
		int a = scan.nextInt();
		System.out.println("영어 점수를 입력해주세요.");
		System.out.print(">>>");
		int b = scan.nextInt();
		System.out.println("수학 점수를 입력해주세요.");
		System.out.print(">>>");
		int c = scan.nextInt();
		
		int total = a+b+c;
		double average = (double)total/3;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		String grade = "";
		if(average >= 90) {
			grade = "A등급";
		}else if(average >= 80) {
			grade = "B등급";
		}else if(average >= 70) {
			grade = "C등급";
		}else {
			grade = "D등급";
		}
		System.out.println("등급 : " + grade);
		
		//Q.02
		System.out.println("숫자를 입력해주세요.");
		System.out.print(">>>");
		int num = scan.nextInt();
		long factorial = 1;
		for(int i=num; i>0; i--) {
			factorial = factorial*i;
		}
		System.out.println("결과 : " + factorial);
	}
}
