package ch05_conditional;

import java.util.Scanner;

/**
 * class Name   : LoopWhile
 * Author       : PARK
 * Created Date : 2025. 1. 24.
 * Version      : 1.0
 * Purpose      : java 기초
 * Description  : 반복문 while
 */
public class LoopWhile {
	
	public static void main(String[] args) {
		//while(조건식) 조건식이 true이면 반복(주의 무한루프)
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("============");
			System.out.println("이름을 입력하세요.(종료q)");
			String nm = scan.nextLine();
			// 문자열 == 문자열 같은지 비교 함수 equals
			if(nm.equals("q")) {
				flag=false;
			}else {
				System.out.println(nm + " 님 환영합니다.");
			}
			System.out.println("============");
		}
		
		//while 문으로 구구단 2 ~ 9 단을 출력하시오
		// 1.2 ~ 9단 while문 작성
		// 2.1 ~ 9수 에 해당되는 while문 작성
		int num = 1;
		while(num<9) {
			//System.out.println(num);
			num++;
			int num2 = 0;
			while(num2<9) {
				//System.out.println(num2);
				num2++;
				System.out.printf("%d x %d = %d \n",num,num2,num*num2);
			}
		}
		
	}
}
