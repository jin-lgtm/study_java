package lesson07_2;

public class Student {

	String name;
	int grade;
	String department;

	Student( ) {}                             //
	
	Student(String n, int g, String d){       //  위 생성자 Student와 이름은
		name = n;                             //  같아도 값이 달라서 overload
		grade = g;
		department = d;
	}
}
