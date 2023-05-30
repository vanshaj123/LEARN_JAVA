package interface_applcn;

public class Child extends Parent{
 
	int b;
	public Child(int a, int b) {
		super(a);
		this.b = b;
	}
	
	public void display() {
		super.display();
		System.out.println("Child called");
	}
}
