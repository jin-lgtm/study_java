package Test;

public class Casting {
	public static void main(String[] args) {
		// 형 변환 연산자
		
		int a = 10;
		int b = 3;
		double re = (double)(a / b); // a와 b를 나눈후 double로 변환
		System.out.println("re = " + re);
		
		double re1 = (double)a / b; // a를 double로 변환후 나눔
		System.out.println("re1 : " + re1);

		double d = 3.92;
		int deci = (int)d;
		System.out.println("정수부 : " + deci);
	}
}
