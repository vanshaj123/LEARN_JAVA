package Objectcreation;

import java.lang.reflect.Constructor;

public class Newinstanceconstructor {

	
	int a = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
      Constructor<Newinstanceconstructor> c = Newinstanceconstructor.class.getDeclaredConstructor();
      Newinstanceconstructor c1 = c.newInstance();
      System.out.println(c1.a);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
