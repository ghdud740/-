package threadpackage;

public class ThreadCreate03 extends Thread{
	public void run(){
			System.out.println("호우");
			try {
			Thread.sleep(1000);	
			} catch (Exception e) {
			}
	}
}

