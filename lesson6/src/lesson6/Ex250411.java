package lesson6;

import java.util.Random;
import java.util.Scanner;

public class Ex250411 {
	public static void main(String[] args) {

		// 187000원  >> 배열사용
		// 1. 50000, 10000, 5000, 1000의 돈 단위를 이용해, 사용된 지폐의 갯수 계산

		int money = 187000;
		int[] units = {50000, 10000, 5000, 1000};
		int[] count = new int[units.length];
		
		for(int i=0 ; i <= units.length ; i++ ) {
			count[i] = money / units[i];
			money %= units[i];
		}
		System.out.println(" 50000원 : " + count[0] + "개");
		System.out.println(" 10000원 : " + count[1] + "개");
		System.out.println(" 5000원 : " + count[2] + "개");
		System.out.println(" 1000원 : " + count[3] + "개");
		
		// 이하 코드 작성 후 갯수 출력
		
		// (String사용) 2. 임의의 문자열 생성, CAPTCHA 생성
		// 문자열의 범위는 숫자, 영대, 영소 10글자
		
		String[] arrStr = new String[10]; 
		
		for(int i = 0 ; i <= arrStr.length ; i++) {
			System.out.println(arrStr[i]);
		}
		
		
		// 3. 배열에 임의값 채우기
		// 100개의 공간을 가지는 배열(0~9사이의 아무 값)
		// [0, 1, 1, 1, 3, 2, 1, 1, 3, 2,......]
		
		int[] numbers = new int[100];
		
		for ( int i = 0 ; i <= numbers.length ; i++) {
			System.out.print(numbers[i]);
			}
		
		
		// 3-2. 빈도수 구하기
		// 배열의 길이는 10

		int[] aaa = new int[10];
		
		for(int i = 0 ; i <= aaa.length ; i++) {
			aaa[i] = i + 1;
			count++;
		}
		;
	
	}
}
