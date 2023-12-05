package threads;


public class EvenRunnable extends Thread{

	Object lock;
	private int nextNum;
	private int MAX_NUM;
	
	
	EvenRunnable(Object lock, int nextNum, int MAX_NUM){
		this.lock = lock;	
		this.nextNum = nextNum;
		this.MAX_NUM = MAX_NUM;
	}
	
	public void run() { 
		synchronized(lock) {

			

//			nextNum++;
			
			System.out.println("Even thread with the name: "+ Thread.currentThread().getName()+" = "+nextNum);
//			lock.notify();
			nextNum++;
			
			
			if(nextNum > MAX_NUM) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
			Thread oddThread = new Thread(new OddRunnable(lock, nextNum, MAX_NUM), "OddThread");
			oddThread.start();
			

//			for(int i=nextNum; i<10; i++) {
//			nextNum = 	
			
			
		}
		
	}
	
}

