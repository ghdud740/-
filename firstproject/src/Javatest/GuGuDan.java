package Javatest;

public class GuGuDan {
	public static void main(String[] args){
		String str[][]=new String[10][10];
		for(int i =1; i <=9; i++){
			for(int j=2; j<=9; j++){
		     str[(i)][(j)]=j+"x"+i+"="+i*j+"\t";
		    System.out.print(str[i][j]);
			}
			System.out.println();
		}
	}
}
