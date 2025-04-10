package lesson05;

public class GuguDan {
	public static void main(String[] args) {
		for(int i = 2 ; i <= 4 ; i++) {
			for(int j = 1 ; j <= 2; j++) {
				System.out.printf("%d * %d = %d\n" , i, j, i*j);
				
			}
		}
	}
}
//  첫번째 for문 초기화 다음 조건식 수행후 2번째 for문 초기화 조건식 수행
//  참이면 두번째 for문 또 수행 거짓이면 첫번째 for문 처음부터 수행
//  첫번째 for문 거짓이면 종료