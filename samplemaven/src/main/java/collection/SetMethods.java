package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set <String> s = new HashSet <String>();
		Set <String> s1 = new HashSet <String>();
		
		//Add method
		s.add("White");
		s.add("Red");
		s.add("Black");
		s.add("White");
		System.out.println(s);
		s1.add("Tree");
		s1.add("Hello");
		
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
		s.remove("Tree");
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
