package exceptions;

public class NewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int x[] = {1,2,3,4,5};
		
		try {
	//	int b = a/0;
		System.out.println(x[5]);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		System.out.println("Outside Try - Finish");
		
	}

}
