package Javatest;

public class Test2 {
	public static void main(String[] args){
		String fruits = "apple 배 복숭아 레몬 키위 바나나 딸기";
		String arr[]=fruits.split(" ");
		String a =null;
		int position1 = 2;
		int position2 = 4;
		a = arr[position1];
		arr[position1]= arr[position2];
		arr[position2]= a;
		for(int i=0; i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
	}
}
