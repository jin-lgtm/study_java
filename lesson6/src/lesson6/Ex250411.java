package lesson6;

public class Ex250411 {
	public static void main(String[] args) {
		// 187000원  >> 배열사용
		// 1. 50000, 10000, 5000, 1000의 돈 단위를 이용해, 사용된 지폐의 갯수 계산
		int[] units = {50000, 10000, 5000, 1000};
		int[] count = new int[units.length];
		
		
		// 이하 코드 작성 후 갯수 출력
		
		// (String사용) 2. 임의의 문자열 생성, CAPTCHA 생성
		// 문자열의 범위는 숫자, 영대, 영소 10글자
		
		
		// 3. 배열에 임의값 채우기
		// 100개의 공간을 가지는 배열(0~9사이의 아무 값)
		// [0, 1, 1, 1, 3, 2, 1, 1, 3, 2,......]
		
		// 3-2. 빈도수 구하기
		// 배열의 길이는 10
		
		// 교재 연습문제 111p
		
		// 교재 1.
		int sum = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			if( i % 5 == 0) {
				sum = sum + i;
			}
			else {
				 
			}
		}
		System.out.println("5의 배수의 합계는 : " +sum);
		
		// 교재 2.
		int evenSum = 0;
		int oddSum = 0;
		for(int i=1 ; i <= 100 ; i++) {
			if(i % 2 == 0) {
				evenSum = evenSum + i;
			}
			else {
				oddSum = oddSum + i;
			}
		}
		System.out.println("짝수의 합계는 : " + evenSum);
		System.out.println("홀수의 합계는 : " + oddSum);
		
		// 교재 3.
		for(int x =1 ; x <= 6 ; x++) {
			for(int y=1 ; y <= 6 ; y++) {
				int sumdd = x + y;
				if(sumdd == 6) {
					System.out.println();
				}
				else {
				}
			}
		}
		
		// 교재 4.
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.printf("*");
			}
		System.out.println();
		}
		
		// 교재 5.
		
		// 교재 6.
		
		// 교재 7.
		int i = (int)(Math.random() * 6+1);

		
				
		
	}
}
