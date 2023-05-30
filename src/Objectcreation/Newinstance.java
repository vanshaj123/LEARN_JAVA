package Objectcreation;

public class Newinstance {
  int a=9;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class c = Class.forName("Newinstance");//
		
		//Creating object of main class using Instance()
		Newinstance obj = (Newinstance)c.newInstance();
		
		System.out.println(obj.a);
		}
		
		catch(ClassNotFoundException a) {
			a.printStackTrace();
		}
		
		catch(IllegalAccessException e) {
			e.printStackTrace();
		}
		
		catch(InstantiationException e) {
			e.printStackTrace();
		}
	}

}
