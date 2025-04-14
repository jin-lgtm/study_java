package lesson06_2;

public class ArrEx10 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
					// 0번째    1번째    2번째    인덱스   
		System.out.println(arr[1][0]); // int 타입
		
		String[][][] strs = {
				{}, { { "A", "B", "c" } , {"가" , "나" , "다"} }, { { "0" , "1" } } 
		};
		// strs.length
		// {}
		// { { "A", "B", "c" } , {"가" , "나" , "다"} }
		// { { "0" , "1" } } 
		
		System.out.println(strs.length);
		System.out.println(strs[1].length); // string 2차원 배열
		System.out.println(strs[1][1].length);
		System.out.println(strs[1][1][1]);
	}
}
