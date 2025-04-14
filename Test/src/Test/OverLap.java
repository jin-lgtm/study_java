package Test;

import java.util.Scanner;

public class OverLap {
	public static void main(String[] args) {
		// 과목 모두 60점 이상 평균도 60점 이상이면 합격
		Scanner in = new Scanner(System.in);
		
		int kor, eng, mat;
		System.out.println("국어 영어 수학 점수 입력(공백구분) : ");
		kor = in.nextInt();
		eng = in.nextInt();
		mat = in.nextInt();
		in.close();
		
		double avg = (kor + eng + mat) / 3.0;
		
		if(avg >= 60) {
			if(kor >= 60 && eng >= 60 && mat >= 60) {
				System.out.println("모든 과목이 60점 이상으로 합격입니다.");
			}
			else {
				if(kor < 60) {
					System.out.println("국어 ");
				}
				if(eng < 60) {
					System.out.println("영어 ");
				}
				if(mat < 60) {
					System.out.println("수학 ");
				}
				System.out.println("과락으로 탈락입니다.");
			}
		}
		else {
			System.out.println("평균 미달로 탈락입니다.");
		}
	}
}
