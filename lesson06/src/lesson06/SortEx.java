package lesson06;

import java.util.Arrays;

public class SortEx {
	public static void main(String[] args) {
		// 정렬
		// 버블 정렬
		
		// {3,4,1,5,2}
		
		// == 정렬순서 == 1회차
		// {3,4,1,5,2} ; 3과4 비교
		// {3,1,4,5,2} ; 4와1을 비교해서 이동
		// {3,1,4,5,2} ; 4,5 비교
		// {3,1,4,2,5} ; 5,2 비교 이동
		
		// 정렬 2회차
		// {1,3,4,2,5}
		// {1,3,4,2,5}
		// {1,3,2,4,5}
		
		// 정렬 3회차
		// {1,3,2,4,5}
		// {1,2,3,4,5}
		
		// 정렬 4회차
		// {1,2,3,4,5}
		
		int[] arr = {5,4,3,2,1};
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
