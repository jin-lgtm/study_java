package lesson04;

public class EX {
	public static void main(String[] args) {
		//한 사람이 사탕 72개를 가지고 있다. 이 사탕을 6명에게 똑같이 나눠주려고 한다.
		//각 사람이 받는 사탕 수를 계산하여 출력하시오.
		int cd = 72;
		int p = 6;
		int a = cd / p;
		System.out.println("각 받는 사탕 수 : " + a);
		
		
		// 컵케이크 23개를 4명이 나눠 가질 때, 남는 컵케이크의 개수를 출력하는 코드를 작성하시오.
		int ck = 23;
		int p1 = 4;
		int b = ck % p1;
		System.out.println("남는 컵케이크의 개수 : " + b );
		
		
		// 입장 조건 확인
		// 놀이기구를 타려면 키가 150cm 이상이어야 한다.
		// 키가 148cm인 사람이 탈 수 있는지를 boolean으로 출력하시오.
		int tall = 148;
		boolean tall1 = tall > 150;
		System.out.println("놀이기구 탈수 있는 키인가 : " + tall1);
		
		// 점수 더하기
		// 변수 score에 10을 저장한 후,
		// 20점을 추가한 뒤 score의 값을 출력하는 코드를 작성하시오.
		int score =10;
		int d = score + 20;
		System.out.println("score의 값 : " + d);
		
		
		// 레벨 변화
		// 레벨이 3으로 시작해서 2번 증가하고, 1번 감소하였다.
		// 현재 레벨을 출력하는 코드를 작성하시오.
		// (단, 증감 연산자만 사용할 것)
		int level = 3;
		++level;
		++level;
		--level;
		System.out.println("현재 레벨 : " + level);
		
		
		// 티켓 검사
		// hasID = true, hasTicket = false인 상태에서
		// 두 조건이 모두 만족되어야 입장할 수 있도록
		// canEnter의 값을 boolean으로 출력하시오.
		boolean hasID = true;
		boolean hasTicket = false;
		boolean canEnter = hasID && hasTicket;
		System.out.println("입장 가능 : " + canEnter);
		
		
		// 평균 점수 구하기
		// 세 과목의 점수가 각각 80, 90, 70일 때,
		// 평균 점수를 계산하여 출력하는 코드를 작성하시오.
		// (단, 소수점 처리는 하지 않아도 됨)
		int aa = 80;
		int bb = 90;
		int cc = 70;
		int dd = (aa + bb + cc) / 3;
		System.out.println("평균 점수 : " + dd);
		
		
		// 조건 판별식
		// 다음 조건을 만족하면 true를 출력하는 코드를 작성하시오.
		// 나이가 20세 이상이고
		// 회원가입이 완료되어 있어야 함
		// int age = 21;
		// boolean isRegistered = true;
		int age = 21;
		boolean isRegistered = true;
		boolean result = age > 20 && isRegistered;
		System.out.println("조건만족 : " + result);
		
		
		// 계산 순서 주의
		// 다음 조건에 따라 점수를 계산하시오.
		// 초기 점수는 10
		// 3을 곱하고
		// 5를 더한 뒤
		// 3으로 나눈다
		// 최종 점수를 출력하는 코드를 작성하시오.
		int gg = 10;
		double hh =((gg * 3) +5) / 3;
		System.out.println("최종 점수 : " + hh);

		
		// 입장 심사 시스템 구성
		// 어떤 공연장에서는 다음 조건을 모두 만족해야 입장이 가능하다.
		// 나이가 18세 이상이고
		// 티켓을 가지고 있으며
		// VIP가 아닐 경우만 입장 가능
		// 다음 변수를 사용하여 입장 가능 여부(canEnter)를 판단하는 코드를 작성하시오.
		// int age = 20;
		// boolean hasTicket = true;
		// boolean isVIP = false;
		int age1 = 20;
		boolean hasTicket1 = true;
		boolean isVIP = false;
		boolean result1 = age1 > 18 && hasTicket1 != isVIP;
		System.out.println("입장 가능 여부 : " + result1);
				
	}
}
