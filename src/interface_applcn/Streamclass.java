package interface_applcn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(1,3,6,9);
		
		List<Integer> square = l.stream()
				.filter(x->x%2!=0)
				.sorted()
				.collect(Collectors.toList());
		
		int c= l.stream()
				.map(x->x+2)
				.reduce(10,(p,i)->p+i);
		
		        l.stream()
				.map(x->x+2)
				.forEach(i->System.out.println(i));
		
		System.out.println(square);
		System.out.println(c);
	}

}
