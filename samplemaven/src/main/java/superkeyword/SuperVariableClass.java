package superkeyword;

public class SuperVariableClass extends SuperVariable {

	String s = "Serah";
	public void display()
	{
		System.out.println(s);
		System.out.println(super.s);
	}
	public static void main(String[] args) {
		SuperVariableClass obj = new SuperVariableClass();
		obj.display();

	}

}
