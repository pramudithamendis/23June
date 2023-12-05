package threads;

public class Test {

	private static final int MAX_NUM = 20;
	private static volatile int nextNum = 0;
	private static final Object lock = new Object();
	
	public static void main(String args[]) {
		
	
	Thread evenThread = new Thread(new EvenRunnable(lock, nextNum, MAX_NUM), "EvenThread");
	evenThread.start();
	//changed


//	Thread oddThread = new Thread(new OddRunnable(), "OddThread");
//	
//
//	Thread oddThread2 = new Thread(new OddRunnable(), "OddThread");
//	oddThread2.start();

	 
	}
	

	

	
}






