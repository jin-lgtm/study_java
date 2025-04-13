package lesson6;

import java.util.Random;

public class Ex250411_3 {
	public static void main(String[] args) {
		// 3. 배열에 임의값 채우기
		// 100개의 공간을 가지는 배열(0~9사이의 아무 값)
		// [0, 1, 1, 1, 3, 2, 1, 1, 3, 2,......]
		int[] numbers = new int[100];
			Random rand = new Random();
			int value = rand.nextInt(10);
			for ( int i = 0 ; i <= numbers.length ; i++) {
				System.out.print(numbers[i]);
			}
			
	}
}
