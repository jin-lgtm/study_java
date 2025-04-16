package lesson08;

public class SuperEx {
	public static void main(String[] args) {
		
//		new Child().print();
		Child  child = new Child();
		child.print();
		
	}
}

class Parent {              // class Parent extends Object {
//	super();
	int number = 3;
	
	
	Parent(){
		System.out.println("부모 객체 생성");
	}
}

class Child extends Parent {
	
	int number = 2;
	
	Child(){
		super();
		System.out.println("자식 객체 생성");
	}
	
	void print() {
		int number = 1;
		System.out.println(number);
		System.out.println(this.number);
		System.out.println(super.number);
	}
}





