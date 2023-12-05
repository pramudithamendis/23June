package threads;

public class EvenOddPrinter {

	private static final int MAX_NUM = 20;
	private static volatile int nextNum = 1;
	private static final Object lock = new Object();
	
	public static void main(String args[]) {
		
	Thread evenThread = new Thread(new EvenRunnable(), "EvenThread");
	evenThread.start();
	//changed


//	Thread oddThread = new Thread(new OddRunnable(), "OddThread");
//	
//
//	Thread oddThread2 = new Thread(new OddRunnable(), "OddThread");
//	oddThread2.start();

	 
	}
	
	static class EvenRunnable extends Thread{
		
		
		public void run() { 
			synchronized(lock) {

				

//				nextNum++;
				
				System.out.println("EvenThread: "+nextNum);
//				lock.notify();
				nextNum++;
				
				
				if(nextNum > MAX_NUM) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
				
				Thread oddThread = new Thread(new OddRunnable(), "OddThread");
				oddThread.start();
				

//				for(int i=nextNum; i<10; i++) {
//				nextNum = 	
				
				
			}
			
		}
		
	}
	
	static class OddRunnable extends Thread{
		
		public void run() {
			synchronized(lock) {

				
				System.out.println("OddThread: "+nextNum);
//				try {
//					lock.wait();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				nextNum++;
				
				if(nextNum > MAX_NUM) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				
				
				
				Thread evenThread = new Thread(new EvenRunnable(), "EvenThread");
				evenThread.start();
				

				
				
			}
		}
		
	}
	
	
}






