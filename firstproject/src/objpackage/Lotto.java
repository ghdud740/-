package objpackage;

import java.util.Random;

public class Lotto {
	
	void lottoNum(){
		int arr[] = new int[6];
		Random random = new Random();
		for (int i = 0 ; i < arr.length; i++){
			arr[i] = random.nextInt(45)+1;
			System.out.println(i+"번쨰"+arr[i]+"숫자");
			for(int j = 0; j < i; j++){
				System.out.println(j+"번쨰확인");
				if(arr[i] == arr[j]){
					System.out.println("중복");	
					i = i - 1;
					break;
				}
		
			}
		}
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
	}
}
