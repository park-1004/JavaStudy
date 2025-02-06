package practice;

import java.util.Scanner;

public class Result02 {
	
	// Q.2 업다운 게임
	// 1 ~ 50 사이의 랜덤 정수 생성
	// 기회는 5번!
	public static void main(String[] args) {
		System.out.println("== 난수 발생 == ");
		//for(int i=0; i<10; i++) {
			//System.out.println(Math.random());// 난수 생성 메소드 0~1 사이 실수
		//}
		int randInt = (int)(Math.random()*50+1);//1~50사이의 정수
		//System.out.println(randInt);
		for(int count=5; count>=1; count--) {
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력해주세요 : ");
			int num = scan.nextInt();
			if(num == randInt) {
				System.out.println("정답입니다.");
				break;
			}
			if(num > randInt) {
				if(count==1) {
					break;
				}else{
				System.out.println("다운!! 기회가" +(count-1)+"번 남았습니다.");
				}
			}
			if(num < randInt) {
				if(count==1) {
					break;
				}else {
				System.out.println("업!! 기회가" +(count-1)+"번 남았습니다.");
				}
			}
				
		}
		System.out.println("실패하였습니다. 정답은"+randInt+"였습니다.");
	}
}
