package lesson07;

public class Ex250414_1 {
	public static void main(String[] args) {
		// 1.피보나치 수열 출력
		// 반복문 관련
		// 피보나치 수열 숫자 20개 출력
	    // 규칙 첫 두자리 숫자의 합이 다음 숫자의 합. 그 다음 숫자는 이전 두 숫자의 합의 연속.
		//  1 1 2 3 5 8 13 21 44 65 109 ....
		int a = 1;
		int b = 1;
		System.out.print(" 1 1 ");
		for(int i = 0 ; i < 20 ; i++) {
			int c = a + b; // 2
			System.out.print(c + " ");
			a = b; // 1
			b = c; // 2
		}
		
		
		/*
		 * 1 1 2
		 *   1 2 3
		 *     2 3 5 
		 * 
		 */
		
	
	}
}
