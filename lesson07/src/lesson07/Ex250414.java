package lesson07;

public class Ex250414 {
	public static void main(String[] args) {
		
		// 1.피보나치 수열 출력
		// 반복문 관련
		// 피보나치 수열 숫자 20개 출력
		// 규칙 첫 두자리 숫자의 합이 다음 숫자의 합. 그 다음 숫자는 이전 두 숫자의 합의 연속.
		//  1 1 2 3 5 8 13 21 44 65 109 ....
		int n = 20;
		int[] number = new int[n];

		number[0] = 1;
		number[1] = 1;
		number[2] = number[0] + number[1];

		for (int i = 3; i < n; i++) {
			number[i] = number[i - 1] + number[i - 2];
		}
		for (int num : number) {
			System.out.print(num + " ");
		}
	}
	
	
		// 2. 50개의 길이를 가지는 정수 배열 생성. 각 값은 1~20 사의 숫자로 채우기
		// 이후 중복된 값을 제거한 새로운 배열을 생성
		

				
		
		// 3. 2차원 배열
		// **
		// **
		// **
		// *****
		// *****
		
		char[][] chs = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
		};
		// 90도 시계 방향 회의 결과를 result에 담으시오
		char[][] result = new char[5][5];
		
	 	
}
