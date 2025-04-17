package lesson09;

import java.util.Comparator;
import java.util.Iterator;

public class ComplexerMain {

	public static void main(String[] args) {
		
		Complexer com = new Complexer();
		System.out.println(Printer.INK);
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);
		com.print();
		com.scan();
		com.send("02-8765-4321");
		com.receive("02-8765-4321");
		
		Comparable<?> c;     // Interface   클래스에 구현되기 위해
		Comparator<?> c2;    // Interface   객체를 만들기 위해
		
		Iterable<?> i;
		Iterator<?> i2;
		
	}
}
