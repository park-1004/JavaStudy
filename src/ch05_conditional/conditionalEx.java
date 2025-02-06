package ch05_conditional;

import java.util.Scanner;

public class conditionalEx {
	public static void main(String[] args) {
		/* 사용자로 부터 숫자를 입력 받아 짝수인지 홀수인지 판별하시오.
		 * 조건1:정수만 입력받음.
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(정수)");
		System.out.print(">>>");
		// if문을 사용하여 짝수면 "짝수" 홀수면 "홀수"를 출력하시오.
		// 1.입력받음 (형변환 int로)
		String input = scan.nextLine();
		int number = Integer.parseInt(input);
		// 2.조건식 if,  연산자 operator 사용
		String count = "";
		if (number % 2 == 0) {
			count = "짝수";
		}else {
			count = "홀수";
		}
		// 3.출력
		System.out.println(count);
		
	}
}
