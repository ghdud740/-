package Javatest;

public class Split {

	public static void main(String[] args) {
		String str = "html oracle java spring jQuery javascript Android";
		String arr[] = str.split(" ");
		for(int i= 0; i<arr.length; i++){
			if(arr[i].equals("java")){
				System.out.println(i+"번째"+arr[i]);
			break;
			}
		}
	}
}
