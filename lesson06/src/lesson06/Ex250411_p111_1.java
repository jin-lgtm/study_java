package lesson06;

public class Ex250411_p111_1 {
	public static void main(String[] args) {
		
		// 교재 1. 1부터 100까지의 정수 중 5의 배수의 합계

		int sum = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			if( i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("5의 배수의 합계는 : " +sum);
	}
}
