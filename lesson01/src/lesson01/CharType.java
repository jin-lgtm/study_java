package lesson01;

public class CharType {
    public static void main(String[] args) {
		char 문자 = '가';
		System.out.println(문자);
		
		int 정수화된문자 = 문자;
		System.out.println(정수화된문자);
    	
		String str = "가" + "나" + "다라마"; // 가나다라마
		System.out.println(str);
		
    	char a='A';
		// syso 입력 후 ctrl+space
		System.out.println("a : "+a);
		
		int b = a;
		System.out.println("b : "+b);
		
		char c = 66;
		System.out.println("c : "+c);
		
		int d = a+b;
		System.out.println("d : "+d);
	}
}
