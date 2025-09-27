package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("Merin");
		l.add(5);
		l.add(5.5);
		l.add(567.45);
		l.add('a');
		l.add(5);
		System.out.println(l);
		
		System.out.println(l.get(3));
		
		l.set(0, "Jerin");
		System.out.println(l);
		
		System.out.println(l.indexOf(5));
		
		System.out.println(l.lastIndexOf(5));
		
		l.remove(5.5);
		System.out.println(l);
		
		System.out.println(l.contains("Varghese"));
		
		System.out.println(l.isEmpty());
		
		System.out.println(l.size());
		

	}

}
