package interfaceexample;

public class InterfaceChild implements Interface1{

	public static void main(String[] args) {
		InterfaceChild obj = new InterfaceChild();
		obj.display();
		obj.print();
	

	}

	@Override
	public void display() {
		System.out.println("Display method");
		
	}

	@Override
	public void print() {
		System.out.println("Print method");
		
	}

}
