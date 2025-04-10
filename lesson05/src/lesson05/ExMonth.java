package lesson05;

import java.util.Scanner;

public class ExMonth {
	public static void main(String[] args) {
		// 월(month)을 입력받아서 계절을 출력
		// 예시  3~5월은 봄
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("월을 입력 : ");
		int m = scan.nextInt();
		String month = "";
		switch (m) {
			case 12: case 1: case 2:
				month = "겨울";
			    break ;
			case 3: case 4: case 5:
				month = "봄";
			    break ;
			case 6: case 7: case 8:
				month = "여름";
			    break ;
			case 9: case 10: case 11:
				month = "가을";
			    break ;
		}
		System.out.println("계절 : " + month);
	}
}
