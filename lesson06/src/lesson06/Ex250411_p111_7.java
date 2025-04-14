package lesson06;

public class Ex250411_p111_7 {
	public static void main(String[] args) {
		
		// 교재 7. 주사위의 눈이 6이 나올때까지 계속 반복해서 굴리고, 눈이 6이 되면
	    //         지금까지 주사위를 굴린 횟수까지 출력하는 코드
		//         ( while문으로 반복, 주사위는 Math.random()으로 작성 )
		int count = 0;
//		int dice = 0;
		while(true) {
//		while (dice != 6) {
//			dice = (int)(Math.random() * 6 )+ 1; // 1 ~ 6
			int dice = (int)(Math.random() * 6 + 1);
			count++;
			System.out.printf("(%d)\n", dice);
			if(dice == 6) break;
			}
		System.out.println("총 주사위 횟수 : " + count);
		}
}
