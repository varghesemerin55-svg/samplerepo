package abstraction;

public class AbstractChild extends AbstractParent {
	public void printdetails()
	{
		System.out.println("Child");
	}

	public static void main(String[] args) {
		AbstractChild obj = new AbstractChild();
		obj.print();
		obj.printdetails();
		obj.display();

	}

	@Override
	public void display() {
		System.out.println("Abstract");
		
	}

}
