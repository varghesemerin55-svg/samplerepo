package polymorphism;

public class PolyChild extends PolyParent{
	public void display(int a, int b)
	{
		super.display(2, 3);
		int c = a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		PolyChild obj = new PolyChild();
		obj.display(4,2);

	}

}
