package ch05_conditional;

public class ConditionalEx3 {
	public static void main(String[] args) {
		/* 거꾸로 트리를 5층 만들어 주세요
		 * 실행 결과
		   
		   ***** 
		   **** 
		   *** 
		   **
		   *
		 
		 * */
		// 중첩 for문 or 문자열자르기
		for(int i=1; i<=5; i++) {
			for(int j=5; j>i-1; j--) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}
