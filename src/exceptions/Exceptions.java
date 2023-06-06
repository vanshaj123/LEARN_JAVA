package exceptions;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		
		try {
			System.out.println(a[5]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("In finally");
		}
	}

}
