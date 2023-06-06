package thread;

public class Threadclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnablethread r = new Runnablethread();
		
		Thread t1 = new Thread(r);
		
		t1.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main:"+i);
			
		}
	}

}
