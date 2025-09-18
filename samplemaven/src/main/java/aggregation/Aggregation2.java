package aggregation;

public class Aggregation2 {
	String city;
	String state;
	Aggregation1 ref;
	
	public Aggregation2(String city, String state, Aggregation1 ref)
	{
		this.ref = ref;
		this.city = city;
		this.state = state;
	}
	public void display()
	{
	System.out.println(ref.name + " " +ref.rollno+ " "+city+ " "+state);	
	}

	public static void main(String[] args) {
		Aggregation1 obj1 = new Aggregation1("Merin",32);
		Aggregation2 obj2 = new Aggregation2("PTA","Kerala",obj1);
		obj2.display();

	}

}
