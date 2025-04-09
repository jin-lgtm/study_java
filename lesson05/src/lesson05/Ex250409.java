package lesson05;

import java.util.Scanner;

public class Ex250409 {
	public static void main(String[] args) {
		// 수정
		// 1.로그인 인증
		// 사용자로 부터 아이디와 비밀번호를 입력 받고
		// 그 아이디가 admin, 비밀번호가 1234 일때 로그인 성공
		// 아이디가 admin 비밀번호가 틀렸을때 로그인 실패 > 잘못된 번호
		// 아이디가 admin이 아니면 없는 계정 메세지 출력
		Scanner scanner = new Scanner(System.in);

		System.out.println("아이디를 입력하세요 : ");
		String userId = scanner.nextLine();
		
		System.out.println("비밀번호를 입력하세요 : ");
		String userPw = scanner.nextLine();

		if(admin == userId && 1234 == userPw) {
			System.out.println("로그인 성공");
		}
		else if(admin == userId && 1234 != userPw) {
			System.out.println("로그인 실패 : 잘못된 번호");
		}
		if(admin != userId) {
			System.out.println("로그인 실패 : 없는 계정");
		}
		
		
		// 2. 숫자 하나를 입력받아서
		// 3의 배수 그리고 짝수 여부를 동시판별
		// 3의 배수 , 짝수, 3의 배수이면서 짝수, 둘다 아닌경우
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
	 	int num = scanner.nextInt();
		if(num % 3 == 0 && num % 2 == 0) {
			System.out.println(" 3의 배수 이면서 짝수 ");
		}
		else if (num % 3 == 0) {
			System.out.println(" 3의 배수 ");
		}
		else if (num % 2 == 0) {
			System.out.println(" 짝수 ");
		}
		else {
			System.out.println(" 둘 다 아님 ");
		}
		
		
		// 3. 월(month)을 입력받아서 계절을 출력
		// 예시  3~5월은 봄
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" 월을 입력  : ");
		int month = scanner.nextInt();
		
		String season;
		
		if (month >= 3 && month <= 5) {
			season = "봄";
		}
		else if (month >= 6 && month <= 8) {
			seson = "여름";
		}
		else if (month >= 9 && month <= 11) {
			seson = "가을";
		}
		else if (month == 12 || month == 1 || month ==2) {
			seson = "겨울"
		}
		else {
			seson = " 잘못 입력 "
		}
		System.out.println(" 계절  : " + seson);		
		
	}
}
