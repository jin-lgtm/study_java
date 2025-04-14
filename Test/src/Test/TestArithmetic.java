package Test;

import java.util.Scanner;

public class TestArithmetic {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("분 입력 : ");
		int inMin = in.nextInt();
		in.close();
		
		int hour = inMin / 60;
		int minute = inMin % 60;
		System.out.printf("%d분은 %d시간 %d분 입니다.\n", inMin , hour, minute);
	}
}
