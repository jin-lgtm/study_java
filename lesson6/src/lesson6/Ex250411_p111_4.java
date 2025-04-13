package lesson6;

public class Ex250411_p111_4 {
	public static void main(String[] args) {
	
	// 교재 4. 이중 for문을 이용하여 아래와 같은 실행 결과가 출력되도록 코딩
//	*
//	**
//	***
//	****
//	*****
	for(int i = 1 ; i <= 5 ; i++) {
		for(int j=1 ; j <= i ; j++) {
			System.out.print("*");
		}
		System.out.println();
		}
	}
}
