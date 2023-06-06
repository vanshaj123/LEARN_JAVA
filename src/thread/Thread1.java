package thread;

public class Thread1 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread();
		t1.setPriority(10);
		
		Thread t2 = new Thread();
		t2.setDaemon(true);
		
		Thread t3 = new Thread();
		
		t1.start();
		t2.start();
		//t3.start();
		for(int i=0;i<9;i++) {
			
			System.out.println("Thread 1" + t1.getName());
			System.out.println("Thread 2" + t2.getId());
			System.out.println("Thread 3" + t3.getName());
			
			t3.start();
			
		}
		
	}

}
