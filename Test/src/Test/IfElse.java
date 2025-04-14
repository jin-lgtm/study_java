package Test;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		// 국어, 영어 , 수학 세 과목 60 점이상이면 합격.. 아니면 불합격
		Scanner in = new Scanner(System.in);
		
		int kor, eng, mat;
		System.out.println("국어 영어 수학 점수 입력(공백구분) : ");
		kor = in.nextInt();
		eng = in.nextInt();
		mat = in.nextInt();
		
//		if(kor >= 60 && eng >= 60 && mat >= 60) {
//			System.out.println("모든 점수가 60점 이상으로 합격 입니다");
//		}
//		else {
//			System.out.println("한 과목 이상 60점 미만으로 불합격 입니다");
//		}
		
		// 한과목이라도 60점 미만이면 불합격
		if (kor < 60 || eng < 60 || mat < 60) {
			System.out.println("한 과목 이상 60점 미만으로 불합격 입니다");
		} else {
			System.out.println("모든 점수가 60점 이상으로 합격 입니다");
		}
		in.close();
	}
}
