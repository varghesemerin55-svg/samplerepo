package superkeyword;

public class SuperMethodChild extends SuperMethod {
	public void display1()
	{
		super.display();
		System.out.println("Super Method Child");
	}

	public static void main(String[] args) {
		SuperMethodChild obj = new SuperMethodChild();
		obj.display1();

	}

}
