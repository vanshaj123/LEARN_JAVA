package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>(10);
		//List<Student> s = new ArrayList<>(1,"abc",{10,20,30,40});
		
		
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		
		
//		for(int i=0;i<10;i++) {
//			System.out.println(l.get(i));
//		}
		
		for(Integer i:l) {
			System.out.println(i);
		}
		
//		l.remove(3);
//		System.out.println("After removing the element at index 3");
//		for(int i=0;i<9;i++) {
//			System.out.println(l.get(i));
//		}
		
		List<String> s = new ArrayList<>();
		s.add("Abc");
		s.add("Def");
		s.add("Ghi");
		s.add("Jkl");
		
		//s.remove("Ghi");
		
		System.out.println(s);
		
		Iterator z = s.iterator();
		while(z.hasNext()) {
			String str = (String)z.next();
			System.out.println(str);
		}
	}
		

}

