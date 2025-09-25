package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List <String> l = new ArrayList <String>();
		
		//Add Method
		l.add("Red");
		l.add("Blue");
		l.add("Red");
		l.add("Green");
		System.out.println(l);
		
		//Get Method
		System.out.println(l.get(2));
		
		//Set Method
		l.set(1, "Black");
		System.out.println(l);
		
		//indexOf Method
		System.out.println(l.indexOf("Red"));
		
		//lastIndexOf Method
		System.out.println(l.lastIndexOf("Red"));
		
		//Remove Method
		l.remove(3);
		System.out.println(l);
		
		//contains method
		System.out.println(l.contains("White"));
		
		//isEmpty Method
		System.out.println(l.isEmpty());
		
		//size method
		System.out.println(l.size());
		

	}

}
