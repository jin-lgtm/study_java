package lesson06;

public class Ex250411_p111_4 {
	public static void main(String[] args) {
	
	// 교재 4. 이중 for문을 이용하여 아래와 같은 실행 결과가 출력되도록 코딩
//	*
//	**
//	***
//	****
//	*****
	for(int i = 0 ; i < 5 ; i++) {
//		for(int j= 0 ; j <= i ; j++) {
		for(int j = 0 ; j < 5 ; j++) {
			if(j <= i)
			System.out.printf("(%d,%d)", i, j);
		}
//		    else {
//			System.out.printf("%5c", '');
		}
		System.out.println();
		}
	
}
