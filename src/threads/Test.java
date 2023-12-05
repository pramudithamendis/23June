package threads;

public class Test {

	private static final int MAX_NUM = 20;
	private static volatile int nextNum = 0;
	private static final Object lock = new Object();
	
	public static void main(String args[]) {
		
	DaemonThread dt = new DaemonThread();
	dt.setDaemon(true);
	
//	Thread evenThread = new Thread(new EvenRunnable(lock, nextNum, MAX_NUM), "EvenThread");
//	evenThread.start();

	dt.start();
	for(int i=0; i<1000; i++) {

			System.out.println("Hi at main"+ i);
		}

	 
	}
	

	

	
}






