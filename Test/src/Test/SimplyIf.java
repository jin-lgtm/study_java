package Test;

import java.util.Scanner;

public class SimplyIf {
	public static void main(String[] args) {
		// 음의 정수라면 양의 정수로 바꿈
		
		 Scanner in = new Scanner(System.in);
		 int num;
		 System.out.println("정수 입력 : ");
		 num = in.nextInt();
		 
		 if(num < 0) {
			// num = num * -1;
			 num *= -1;
			 System.out.println("음의 정수를 양의 정수로 변환했습니다");
		 }
		 
		 System.out.println("결과는 " + num + "입니다.");
		 in.close();
	}
}
