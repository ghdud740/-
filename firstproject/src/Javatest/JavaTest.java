package Javatest;

public class JavaTest {
	public static void main(String[] args){
		int arr[] = new int[100];
		int start = 1920;
		for( int i=0; i < arr.length; i++){
			if(arr[i]>2016)
			break;
			arr[i] = start + i;		
		}	
		for(int i=0; i < arr.length ; i++){
			if(arr[i]>2016)
			break;
			System.out.println("age:"+arr[i]);
		}
		
	}
}

