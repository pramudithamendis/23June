package threads;

public class DaemonThread extends Thread {

	public void run() {
		for(int i=0; i<10; i++) {
//		while(true) {
			System.out.println("Hi "+ i);
		}
		
	}
}
