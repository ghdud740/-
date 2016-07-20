package objpackage;

public class SumDemo {
	public void sumMulti(int a,int b){
		for(int i = 2; i <= 9; i++){
			for(int j = a; j <= b; j++){
				System.out.print(j+"x"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
}	
