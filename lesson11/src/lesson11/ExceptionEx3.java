package lesson11;

public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			m();
		}
		catch (NoClassDefFoundError e) {
			System.out.println("main catch");
		}
	}
	
	static void m() {
		try {
			System.out.println(1);
			System.out.println(2/0);  // 오류.. catch가 없으면 finally를 무조건 수행하고 메인 try로
			System.out.println(3);
		}
		finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
