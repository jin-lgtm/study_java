package lesson07;

public class Ex250414_1 {
	public static void main(String[] args) {
		// 1.피보나치 수열 출력
		// 반복문 관련
		// 피보나치 수열 숫자 20개 출력
	    // 규칙 첫 두자리 숫자의 합이 다음 숫자의 합. 그 다음 숫자는 이전 두 숫자의 합의 연속.
		//  1 1 2 3 5 8 13 21 44 65 109 ....
		int sum = 0;
		for(int i = 1 ; i <= 20 ; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		System.out.println();
	}
}
