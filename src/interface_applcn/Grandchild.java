package interface_applcn;

public class Grandchild extends Child {
	int c;
	public Grandchild(int a, int b, int c) {
		super(a,b);
		this.c = c;
	}
	
	public void display() {
		super.display();
		System.out.println("Grandchild called");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grandchild p = new Grandchild(1,3,6);
		System.out.println(p.b);
		p.display();
	}

}
