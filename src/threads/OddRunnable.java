package threads;

public class OddRunnable extends Thread{

	Object lock;
	private int nextNum;
	private int MAX_NUM;
	
	OddRunnable(Object lock, int nextNum, int MAX_NUM){
		this.lock = lock;	
		this.nextNum = nextNum;
		this.MAX_NUM = MAX_NUM;	
	}
	
	public void run() {
		synchronized(lock) {

			
			System.out.println("Odd thread with the name: "+ Thread.currentThread().getName()+" = "+nextNum);
//			try {
//				lock.wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			nextNum++;
			
			if(nextNum > MAX_NUM) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			
			
			
			Thread evenThread = new Thread(new EvenRunnable(lock, nextNum, MAX_NUM), "EvenThread");
			evenThread.start();
			

			
			
		}
	}
}

