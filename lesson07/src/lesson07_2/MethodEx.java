package lesson07_2;

public class MethodEx {
	public static void main(String[] args) {
		int result = add(10 , 20);
		System.out.println(result);
		print("Hello");
		System.out.println(addAll(1,2,3));
		
		// Stack
		return;
		
//		int a =10; // 리턴 후 지정 실행안됨
		
	}
	static int add(int a, int b) {
//		int a;  //  -> 블럭안에 또 지정시 에러
		return a + b;
	}
	
	static int addAll(int... nums) {  // int... =>  int의 갯수제한 없음
		int ret = 0;
		for(int n : nums) {
			ret += n;
		}
		return ret;
	}
	
	static void print(String s) {
		System.out.println(s);
	}

}


