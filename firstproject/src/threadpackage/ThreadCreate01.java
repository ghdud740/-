package threadpackage;

public class ThreadCreate01 extends Thread {
	public void run(){
		for(int i = 0; i<100; i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
