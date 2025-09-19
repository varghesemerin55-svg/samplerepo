package interfaceexample;

public class MultipleChild implements MultipleParent1, MultipleParent2{
	public void display1()
	{
		System.out.println("Child Display method");
	}

	public static void main(String[] args) {
		MultipleChild obj = new MultipleChild();
		obj.display();
		obj.display1();
		obj.print();

	}

	@Override
	public void print() {
		System.out.println("Interface Print method");
		
	}

	@Override
	public void display() {
		System.out.println("Interface Display method");
		
	}

}
