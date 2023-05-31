package interface_applcn;

public class Child2 extends Parent{
    int b = 0;
	public Child2(int a, int b) {
		super(a);
		this.b = b;
	}
	
	public void display() {
		super.display();
		System.out.println("Child2 called");
	}
}
