package lesson05;

import java.util.Scanner;

public class ExEvenNum {
	public static void main(String[] args) {
		// 숫자 하나를 입력받아서
		// 3의 배수 그리고 짝수 여부를 동시판별
		// 3의 배수 , 짝수, 3의 배수이면서 짝수, 둘다 아닌경우
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력 : ");
		
		int num = scan.nextInt();
		if (num % 3 == 0 && num % 2 == 0) {
			System.out.println("3의 배수이면서 짝수");
		}
		else if (num % 3 == 0) {
			System.out.println("3의 배수");
		}
		else if (num % 2 == 0) {
			System.out.println("짝수");
		}		
		else {
			System.out.println("둘다 아님");
		}
		
	}
}
