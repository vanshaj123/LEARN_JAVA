package exceptions;

public class AgeExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		AgeExample e = new AgeExample();
		try {
		e.register(12);
		}
		
		catch(InvalidAgeException e1) {
			e1.printStackTrace();
			
		}
		
		
	}
	
	public void register(int age) throws InvalidAgeException {
		
		if(age>=18) {
			System.out.println("Registered successfully");
		}
		
		else {
			throw new InvalidAgeException(age+" is less than 18");
		}
	}

}
