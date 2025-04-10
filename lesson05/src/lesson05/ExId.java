package lesson05;

import java.util.Scanner;

public class ExId {
	public static void main(String[] args) {
		// 로그인 인증
		// 사용자로 부터 아이디와 비밀번호를 입력 받고
		// 그 아이디가 admin, 비밀번호가 1234 일때 로그인 성공
		// 아이디가 admin 비밀번호가 틀렸을때 로그인 실패 > 잘못된 번호
		// 아이디가 admin이 아니면 없는 계정 메세지 출력
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("아이디를 입력하세요 : ");
//		String idin = scan.nextLine();
//		System.out.println("비밀번호를 입력하세요 : ");
//		String pwin = scan.nextLine();
//		
//		String id = "admin";
//		String pw = "1234";
//
//		if(id == idin && pw == pwin) {
//			System.out.println("로그인 성공");
//		}
//		else if(id == idin && pw != pwin) {
//			System.out.println("로그인 실패 : 잘못된 번호");
//		}
//		else {
//			System.out.println("로그인 실패 : 없는 계정");
//		}
	
		String id = "";
		String pw = "";
		System.out.println("아이디를 입력하세요 : ");
		id = scanner.nextLine();
		System.out.println("입력한 아이디 : " + id);
		
		System.out.println("비밀번호를 입력하세요 : ");
		pw = scanner.nextLine();
		System.out.println("입력한 비밀번호 : " + pw);
		// 문자열 비교는 .eqauls()
		if(!id.equals("admin")) { //없는 계정
			System.out.println("존재 하지 않는 계정");
		}
		// 있는 계정
		else if(pw.equals("1234")){ // 로그인 성공  
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("비밀번호 틀림");
		}
	}
}
