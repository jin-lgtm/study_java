package lesson05;

import java.util.Scanner;

public class Ex250409 {
	public static void main(String[] args) {
		// 1.로그인 인증
		// 사용자로 부터 아이디와 비밀번호를 입력 받고
		// 그 아이디가 admin, 비밀번호가 1234 일때 로그인 성공
		// 아이디가 admin 비밀번호가 틀렸을때 로그인 실패 > 잘못된 번호
		// 아이디가 admin이 아니면 없는 계정 메세지 출력
		System.out.println("아이디를 입력하세요 : ");
//		Scanner scan = new Scanner(System.in);
		System.out.println("비밀번호를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		String idin = scan.nextLine();
		String pwin = scan.nextLine();
		String id = "admin";
		String pw = "1234";

		if(id == idin && pw == pwin) {
			System.out.println("로그인 성공");
		}
		else if(id == idin && pw != pwin) {
			System.out.println("로그인 실패 : 잘못된 번호");
		}
		if(id != idin) {
			System.out.println("로그인 실패 : 없는 계정");
		}
		
		
		
		
		
		// 2. 숫자 하나를 입력받아서
		// 3의 배수 그리고 짝수 여부를 동시판별
		// 3의 배수 , 짝수, 3의 배수이면서 짝수, 둘다 아닌경우
				
		
			
		
		
		// 3. 월(month)을 입력받아서 계절을 출력
		// 예시  3~5월은 봄
		System.out.println("월을 입력하세요 : ");
		Scanner scan1 = new Scanner(System.in);
		
		int m = scan1.nextInt();
		String month = "";
		switch (m) {
			case 12: case 1: case 2:
				month = "겨울";
				break;
			case 3: case 4: case 5:
				month = "봄";
				break;
			case 6: case 7: case 8:
				month = "여름";
				break;
			case 9: case 10: case 11:
				month = "가을";
				break;
			default :
				month = "잘못입력"
		}
		
		
		
		
	}
}
