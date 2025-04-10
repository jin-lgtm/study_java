package lesson05;

import java.util.Scanner;

public class ExFor1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자입력");
		int input = scanner.nextInt();
		// while 로 변경
//		int i = 1
//		while(i <= input) {
		for(int i = 1 ; i <= input ; i++) {
			if(input % i == 0) {
				System.out.println(i);
			}
		}
	}
}
