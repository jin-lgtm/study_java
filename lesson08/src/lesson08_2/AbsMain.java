package lesson08_2;

public class AbsMain {
	public static void main(String[] args) {
		
		
	}
}

abstract class Parent {     //  추상클래스
	abstract void m();
}

abstract class Child extends Parent {   // 추상클래스
	
}

abstract class GrandChild extends Child {     // 구현부를 만들면 추상클래스를 안따라 감
	void m() {
		
	}
}

class GrandGrandChild extends GrandChild {  // GrandChild에서 구현부를 만들었기 때문에 에러 안뜸
	
}