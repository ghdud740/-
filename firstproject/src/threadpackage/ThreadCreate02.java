package threadpackage;

import java.io.BufferedReader;
import java.io.FileReader;

public class ThreadCreate02 extends Thread{
	public void run(){
//		StringBuffer sb = new StringBuffer();
		try {
			FileReader file = new FileReader("D:/filecopy/skytome.txt");
//			FileInputStream ins = new FileInputStream(file);
//			InputStreamReader insr = new InputStreamReader(ins,"euc-kr");
			BufferedReader br = new BufferedReader(file);
			String data = null;
			while((data=br.readLine()) != null){
				
				System.out.println(data);
				Thread.sleep(2000);
			}
			
		} catch (Exception e) {
			
		}
	}
}
