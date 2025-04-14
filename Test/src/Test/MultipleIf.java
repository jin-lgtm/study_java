package Test;

import java.util.Scanner;

public class MultipleIf {
	public static void main(String[] args) {
		// 국영수 점수를 입력 받아 평균을 구한 후
		// 평균이 90점 이상이면 A등급
		// 평균이 80점 이상이면 B등급
		// 평균이 70점 이상이면 C등급
		// 평균이 60점 이상이면 D등급
		// 아니라면 F등급
		Scanner in = new Scanner(System.in);
		
		int kor, eng, mat;
		System.out.println("국어 영어 수학 점수 입력(공백구분) : ");
		kor = in.nextInt();
		eng = in.nextInt();
		mat = in.nextInt();
		in.close();
		
		double avg = (kor + eng + mat) / 3.0;
		char grade;
		if(avg >= 90) {
			grade = 'A';
		}
		else if(avg >= 80) {
			grade = 'B';
		}
		else if(avg >= 70) {
			grade = 'C';
		}
		else if(avg >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.printf("평균 : %.2f, 등급 : %c\n" , avg, grade);
		}
}
