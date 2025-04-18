package lesson11;

public class ExceptionMain {
	public static void main(String[] args) {
		// try, catch, finally, throw, throws
		int i =1;
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(args[0]);  // exception
			System.out.println(3 / 0);  //  문제발생 (exception) 시 아래 문장 건너뛰고 catch로
			System.out.println(4);
		}
		catch (NullPointerException e) {
			System.out.println(5); // try 안에 오류가 없으면 건너뜀
		}
		
		catch (ArithmeticException e){
			System.out.println("a");
		}
		
		catch (RuntimeException e) {
			System.out.println("b");
		}
		
		finally {     // 무조건 처리
			
		}
		System.out.println(6);
				
	}
}
