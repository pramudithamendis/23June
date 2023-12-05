package threads;

public class DaemonThread extends Thread {

	public void run() {
		for(int i=0; i<5000; i++) {
//		while(true) {
			System.out.println("Hi at Daemon "+ i);
		}
		
	}
}
