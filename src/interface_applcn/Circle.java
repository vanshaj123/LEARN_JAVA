package interface_applcn;

public class Circle implements Area,Perimeter{
  int r = 10;
  //double area = 3.14 *r*r;

@Override
public void area() {
	// TODO Auto-generated method stub
	double area = 3.14 *r*r;
	System.out.println(area);
}



@Override
public void perimeter() {
	// TODO Auto-generated method stub
	double peri = 2*3.14*r;
	System.out.println(peri);
}
   
  
}
