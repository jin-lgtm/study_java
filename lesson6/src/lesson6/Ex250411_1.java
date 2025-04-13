package lesson6;

public class Ex250411_1 {
	public static void main(String[] args) {
		// 187000원  >> 배열사용
		// 1. 50000, 10000, 5000, 1000의 돈 단위를 이용해, 사용된 지폐의 갯수 계산
		int money = 187000;
		int[] units = {50000, 10000, 5000, 1000};
		int[] count = new int[units.length];
		for(int i=0 ; i <= units.length ; i++ ) {
			count[i] = money / units[i];
			money %= units[i];
		}
		for(int i = 0 ; i < units.length ; i++) {
			System.out.println(units[i] + "원 : +" + count[i] + "개");
		}
	}
}
