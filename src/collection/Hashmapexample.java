package collection;

import java.util.HashMap;

public class Hashmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Student> s = new HashMap<>();
		
		int[] a = {10,20,30,40,50};
		Student s1 = new Student(1,"abc",a);
		
		s.put(1, s1);
		
		System.out.println(s.get(1).marks[0]);
	}

}
