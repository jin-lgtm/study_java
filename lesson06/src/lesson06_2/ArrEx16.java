package lesson06_2;

import java.util.Arrays;

public class ArrEx16 {
	public static void main(String[] args) {
		int[] arrInt = {1,2,3,4,5};
		
		for(int i = 0; i < arrInt.length ; i++) {  //  i -> 인텍스( index for ) 배결내부의 값을 변경 가능
			arrInt[i] = arrInt.length - arrInt[i];
			System.out.println(arrInt[i]);			
		}
		System.out.println(Arrays.toString(arrInt));
		
		// 향상된 for문 (Enhanced for)
		for(int number : arrInt) {  //  number -> 값, 변경불가
			number = 10;
			System.out.println(number);
		}
		System.out.println(Arrays.toString(arrInt));
	
		int[][] arr = {{1,2,3}, {4,5}};
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		// 향상된 for문
		for(int[] tmp : arr) {
			for(int n : tmp) {
				System.out.println(n);
			}
		}
//		String name = "1234"; 
// -> = String n = new String("1234"):
		
		String name = "1234";
		String name2 = "1234";
		String n = new String("1234");
		System.out.println("===============");
		System.out.println(name);
		System.out.println(name2);
		System.out.println(n);
		System.out.println(name == name2);
		System.out.println(name == n);
		
		
		
		
		
		
		
	}
}
