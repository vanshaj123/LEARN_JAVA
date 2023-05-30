package Objectcreation;

public class Clone implements Cloneable{

	
	int a = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clone c = new Clone();
		try {
			
			Clone c1 = (Clone)c.clone();
			System.out.println(c1.a);
		}
		
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
