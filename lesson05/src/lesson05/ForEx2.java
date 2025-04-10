package lesson05;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; i <= 100 ; i++) {
			sum += i;
			System.out.printf("i : %d, sum : %d\n", i, sum);
		}
		System.out.println(sum);
	}

		//  3의 배수의 합계를 구하기
//		int sum = 0;
//		for(int i = 1 ; i <= 100 / 3 ; i++) {
//			sum += i + 3;
//			System.out.println("i : %3d, sum : %4d\n", i, sum);
//		}
//		System.out.println(sum);
		
		// 숫자를 입력받고 해당 숫자의 약수들을 출력(숫자를 나누었을때 나머지가 0인 수)
		// 12
		// 1 2 3 4 6 12
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자 입력");
//		int input = scanner.nextInt();
//		for(int i = 1 : i <= input ; i++) {
//			if(input % i == 0) {
//				System.out.println(i);
//			}
//		}
//	}
//	
//     
}