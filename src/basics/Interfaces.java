package basics;

public class Interfaces implements A,People{//Interfaces provide multiple inheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.abc();
		Interfaces i = new Interfaces();
		i.start();
		A a = new Interfaces();
		 a.start();
		 
		//A s = new A(); 

	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start is implemented");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		
	}

}

interface A{//Interfaces provide true abstraction
	void start();////by default, methods are public and abstract
	
	 static void abc() {
		System.out.println("abc is called");
	}
}

interface People{
	void talk();
}