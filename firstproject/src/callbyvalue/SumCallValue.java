package callbyvalue;

public class SumCallValue {
	
	int sumMeth(int a, int b){
		int sum = a + b ;
		return sum;
	}
	
	int multMeth(int a, int b){
		int mult = a * b ;
		return mult;
	}
	
	String gradeMeth(int a, int b){
		int  num = (a + b) / 2;
		String grade;
		if (num >= 90){
			grade = "A";
		} else if(num >= 80){
			grade = "B";
		} else if(num >= 70){
			grade = "C";
		} else {
			grade = "F";
		}
		return grade;
	}
	//문자를 입력받아 리턴시켜 배열
	String[] arrMeth (String arr[], int st, int en){
	
		String temp = arr[st];
		arr[st]  = arr[en];
		arr[en] = temp;
		
		return arr;
	}
	// 숫자를 임의로 주고 순서에 맞게 배열
	int[] arrNum (int arrnum[]){

		for(int i=0; i<arrnum.length; i++){
			for(int j=i+1; j<arrnum.length; j++){
				if (arrnum[i] > arrnum[j]){
					int temp = arrnum[i];
					arrnum[i] = arrnum[j];
					arrnum[j] = temp;
				}
			}
		}
		return arrnum;
	}
	//배열에서 제일 높은숫자 골라내기
	int valueMax(int arrnum[]){
		int max = 0;
		for(int i=0; i<arrnum.length; i++){
			if(max < arrnum[i]){
				max = arrnum[i];
			}
		}
		return max;
	}
	
	
}
