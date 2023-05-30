package basics;

public class InterfacesClass implements AB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB a = (int i) -> System.out.println("Hello");
		a.show(5);
		
		//a.show1();
	}

	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}
	
	public void show(int i) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}

}
interface AB{
	 void show(int i) ;
}
