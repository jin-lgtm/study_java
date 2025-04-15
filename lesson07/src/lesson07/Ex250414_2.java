package lesson07;

import java.util.Arrays;

public class Ex250414_2 {
	public static void main(String[] args) {
		// 2. 5개의 길이를 가지는 정수 배열 생성. 각 값은 1~3사이의 숫자로 채우기
		// 이후 중복된 값을 제거한 새로운 배열을 생성
		
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 3 + 1);
		}
		System.out.println(Arrays.toString(arr));

		int[] tmp = new int[3];
		System.out.println(Arrays.toString(tmp));
		int length = 0;

		for (int n : arr) {
			boolean insert = true;
			for (int i = 0; i < length; i++) {
				if (arr[0] == tmp[i]) {
					insert = false;
					break;
				}
			}
			if (insert) {
				tmp[length++] = n;
			}
		}
		System.out.println(Arrays.toString(tmp));
		tmp = Arrays.copyOf(tmp, length);
		System.out.println(Arrays.toString(tmp));
		
	}
}