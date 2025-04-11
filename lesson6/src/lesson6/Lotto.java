package lesson6;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		int idx = 0; // index
		while(true) {
			int number = (int)(Math.random() * 45 + 1);
			
			boolean insert = true; // 중복체크 역활
			
			for(int i = 0 ; i <= idx ; i++) {
				if(lotto[i] == number) { // 0 과 뽑은숫자 비교
					insert = false;
					break; // for문 브레이크
				}
			}
			if(insert) {
				lotto[idx] = number;
				idx++;
			}
			if(idx == 6) break; // while문 브레이크
		}
//		System.out.println(Arrays.toString(lotto));
		int[] arr = lotto;
		for(int i = 0 ; i < arr.length -1 ; i++) {  // 회차
			System.out.println(i + 1 + "회차");
			for(int j = 0 ; j < arr.length - 1 - i ; j++) {  // 횟수
				if(arr[j] > arr[j+1]) { // 값 비교
					int tmp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = tmp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		
	}
}
