package interface_applcn;

public class Square implements Area {
  int l = 10;
  
  public Square() {
	  this(4);
	  System.out.println("Square with no parameter called ");
  }
  
  public Square(int a) {
	  this.l = a;
	  System.out.println(l);
  }
  	@Override
	public void area() {
		// TODO Auto-generated method stub
		int ar = l*l;
		System.out.println(ar);
	}
  
}
