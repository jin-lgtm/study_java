package lesson6;

public class Ex250411_p111_2 {
	public static void main(String[] args) {
		
		// 교재 2. 1부터 100까지의 수 중 짝수와 홀수의 합을 가각 구하시오
		
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
	}
}
