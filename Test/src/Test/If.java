package Test;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2;
		System.out.println("두 수 입력 : ");
		n1 = in.nextInt();
		n2 = in.nextInt();
		in.close();
		
		int large;
		large = n1 > n2 ? n1 : n2;
		
		System.out.println("두 수 중 큰 수는 : " + large + "입니다");
	}
}
