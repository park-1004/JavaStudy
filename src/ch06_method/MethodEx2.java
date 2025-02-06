package ch06_method;

import java.util.Scanner;

public class MethodEx2 {
	
	public static void main(String[] args) {
		// coffee shop method를 만들어 주세요
		// input : 고객 수
		// output : 없음
		
		// 고객수만큼 커피 주문을 받아 금액을 출력하는 메소드
		
		// 아아,아메리카노 :3000, 카푸치노 :4500, 밀크티 :5000
		// 메뉴가 없으면 '메뉴가 없습니다. 출력 후 다시 주문받아야함.'
		// n명 고객 주문완료
		// 주문 금액: m원
		coffeeShop(3);
	}
	// 1.메소드 선언 (리턴 없음, 입력인원수)
	public static void coffeeShop(int num) {
		// 2.인원수 만큼 반복(특정 횟수 반복은 for문, 조건이 만족할때까지 반복은 while)
		System.out.println(num +"명 고객 입장.");
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (num > i) {
			System.out.println((i + 1) + "번째 고객님 어떤걸 드릴까요?");
			
			int price = 0;
			if(price > 0) {
				System.out.println("선택한 음료는 " + price + "원 입니다.");
				i++;
			}
			// 3.사용자 입력에 따른 음료의 가격 조건문(단순 값비교는 switch)
			String order = scan.nextLine();
			switch (order) {
				case "아아":
					price = 3000;
					break;
				case "아메리카노":
					price = 3000;
					System.out.printf("선택한 음료는 %d원 입니다.", price);
					break;
				case "카푸치노":
					price = 4500;
					System.out.printf("선택한 음료는 %d원 입니다.", price);
					break;
				case "밀크티":
					price = 5000;	
					System.out.printf("선택한 음료는 %d원 입니다.", price);
					break;
				default:
					System.out.println("메뉴없음");
					break;
				}
			// 4.조건에 해당되는 음료가 있을때 가격 합산 (해당 메소드 전역적으로 합산관련 변수를 사용함.)
			int maxPrice = 0;
			if(order.equals("아아") || order.equals("아메리카노")) {
				maxPrice += 3000;
			}else if(order.equals("카푸치노")) {
				maxPrice += 4500;
			}else if(order.equals("밀크티")) {
				maxPrice += 5000;
			}
			// 5.인원수에 따른 주문이 완료되면 합산 출력
			System.out.println(" ");
			System.out.printf("%d명의 고객 주문완료.", num);
			System.out.println(" ");
			System.out.printf("총 주문 금액: %d원", maxPrice);

			}
		
	}
	
}
