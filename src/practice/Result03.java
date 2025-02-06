package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Result03 {
	public static void main(String[] args) {
		//Q.01
		//로또번호 생성 메서드 1~45까지 랜덤 숫자 6개를 출력하는 makeLotto() 만들어주세요 
		//(로또 번호는 중복이 없습니다.)
		ArrayList<Integer> weekLotto = null;
		weekLotto = makeLotto();
		System.out.println(weekLotto.toString());
	
		//Q.02
		//위의 로또번호 생성 메서드를 오버로딩하여 사용자의 희망 번호 최대 6개를 매개변수로 전달받아 나머지 숫자를 1~45까지로 생성 후 오름차순으로 출력하는 makeLotto(String [] strArr) 만들어주세요
		//(로또 번호는 중복이 없습니다.)
		//참고사항: 사용자의 매개변수 전달 값에도 중복은 없습니다.
		String [] numArr = {"1","5"};
		weekLotto = makeLotto(numArr);
		System.out.println(weekLotto.toString());
	}

	public static ArrayList<Integer> makeLotto(){
		ArrayList<Integer> lotto = new ArrayList<>();
		while(lotto.size() < 6) {
			int num = (int)((Math.random() * 45) +1);
			lotto.add(num);
		}
		return lotto;
	}
	public static ArrayList<Integer> makeLotto(String [] strArr) {
		ArrayList<Integer> lotto = new ArrayList<>();
		while(lotto.size() < 6) {
			int num = (int)((Math.random() * 45) +1);
			lotto.add(num);
		}
		return lotto;
	}
}
