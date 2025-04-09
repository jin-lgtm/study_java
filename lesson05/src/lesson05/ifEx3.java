package lesson05;

public class ifEx3 {
	public static void main(String[] args) {
		
		int math = 90;
		int eng = 95;
		
//		String msg = "탈락";
//		if(math >= 60) {
//			if(eng >= 60) {
//				msg = "통과";
//			}
//		}
// 		System.out.println(msg);		
		
		
		if(math >= 60) {
			if(eng >= 60) {
				System.out.println("통과");
			}
			else {
				System.out.println("탈락");
			}
		}
		else {
			System.out.println("탈락");
		}
	}
}
