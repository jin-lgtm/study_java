package lesson05;

import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 선택하세요 > ");
		Scanner scanner = new Scanner(System.in);
		int me = scanner.nextInt();
		System.out.println(me);
		
		int com = (int)(Math.random() * 3 + 1); // 0 이상 1 미만의 값 > 0 이상 3 미만 > 1 이상 4 미만 > 정수화
		System.out.println(com);
		String[] values = {"가위", "바위", "보"};
		System.out.println("내가 낸것 : " + values[me-1] + ",컴퓨터가 낸것 : " + values[com-1]);
		

		// switch를 활용해 승리, 패배, 무승부 출력
		switch(me - com) {
		case -2: case 1:
			System.out.println("승리");
			break;
		case 0:
			System.out.println("무승부");
			break;
		case -1: case 2:
			System.out.println("패배");
			
		}
		// 0.0  > *3하면 0.0  > *6  0.0  
		// 0.1  > *3하면 0.3  > *6  0.6
		// 0.2  > *3하면 0.6  > *6  1.2
		// 0.3  > *3하면 0.9  > *6  1.8
		// 0.4  > *3하면 1.2  > *6  2.4
		// 0.5  > *3하면 1.5  > *6  3.0
		// 0.6  > *3하면 1.8  > *6  3.6
		// 0.7  > *3하면 2.1  > *6  4.2
		// 0.8  > *3하면 2.4  > *6  4.8
		// 0.9  > *3하면 2.7  > *6  5.4
		
	}
}
