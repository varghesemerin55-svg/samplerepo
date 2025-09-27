package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {

	public static void main(String[] args) {
		Set s = new HashSet();
		Set s1 = new HashSet();
		
		//Add method
		s.add("White");
		s.add(5);
		s.add(1.21);
		s.add(3456.67);
		s.add('m');
		System.out.println(s);
		s1.add(7);
		s1.add("Hello");
		System.out.println(s1);
		
		//Add All method --- Add all the elements of s1 into s
		s.addAll(s1);
		System.out.println(s);
		
		//contains method
		System.out.println(s.contains("Hello"));
		
		//containsAll method --- to check whether all the elements of s1 set is present in s set
		System.out.println(s.containsAll(s1));
		
		//isEmpty method
		System.out.println(s.isEmpty());
		
		//remove method -- only possible using the value
		s.remove(7);
		System.out.println(s);
		
		//removeAll method --- to remove all the elements of s1 from s
		s.removeAll(s1);
		System.out.println(s);
		
		//size method
		System.out.println(s.size());
		
		//clear method --- to remove all elements from a set
		s1.clear();
		System.out.println(s1);

	}

}
