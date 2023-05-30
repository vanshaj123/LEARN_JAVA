package interface_applcn;

public class Square implements Area {
  int l = 10;
  	@Override
	public void area() {
		// TODO Auto-generated method stub
		int ar = l*l;
		System.out.println(ar);
	}
  
}
