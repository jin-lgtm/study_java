package lesson06;

import java.util.Arrays;

public class Ex250411_3 {
	public static void main(String[] args) {

		// 3. 배열에 임의값 채우기
		// 10개의 공간을 가지는 배열(0~9사이의 아무 값)
		// [0, 1, 1, 1, 3, 2, 1, 1, 3, 2,......]
		
		int[] arr = new int[10];
		for(int i = 0 ; i < arr.length ; i++) {
		arr[i] = (int)(Math.random() * 10); // 10 => 범위
		}
		System.out.println(Arrays.toString(arr));
		
		int[] counts = new int[10];
//	counts[arr[0]]++;
//  counts[arr[1]]++;
//	[1,0,0,0,2,0,1,1,0,1]
		for(int i = 0 ; i < arr.length ; i++) {
			counts[arr[i]]++;
		}
		System.out.println(Arrays.toString(counts));
	} 
}