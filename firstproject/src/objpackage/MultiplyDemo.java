package objpackage;

public class MultiplyDemo {

	void multiMeth(){
		for(int i = 1 ; i <= 9; i++){
			for(int j = 2; j<=9; j++){
				System.out.print(j+"x"+i+"="+j*i+"\t");
			}	
			System.out.println();
		}
	}
	 void callmeth(){
		 System.out.println("call meth...");
	 }

}
