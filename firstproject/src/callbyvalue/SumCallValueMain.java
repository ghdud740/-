package callbyvalue;

public class SumCallValueMain {

	public static void main(String[] args) {
		SumCallValue obj = new SumCallValue();
	    int a = 80;
	    int b = 90;
		int resultmul = obj.multMeth(a, b);
		int resultsum = obj.sumMeth(a, b);
		String resultgrad = obj.gradeMeth(a, b);
		System.out.println("A x B ="+resultmul);
		System.out.println("A + B ="+resultsum);
		System.out.println("AVG(A,B) ="+resultgrad);
		//문자를 입력받아 리턴시켜 배열
		String arr[] = {"html","oracle","java","spring","jQuery","jsp"};
		for(String arrst : arr){
			System.out.print(arrst + " ");
		}
		System.out.println();
		String[] arr2 = obj.arrMeth(arr, 2, 4);
		for(String arren : arr2){
			System.out.print(arren + " ");
		}
		 System.out.println();
		// 숫자를 임의로 주고 순서에 맞게 배열
		int arrnum[] = { 95, 20,90,12,35,56,73,11};
		for (int result : arrnum){
			System.out.print(result+"\t");
		}
		System.out.println();
		int arrnum1[] = obj.arrNum(arrnum);
		for( int result : arrnum1){
			System.out.print(result +"\t");
		}
		//배열에서 제일 높은숫자 골라내기
		System.out.println();
		int result = obj.valueMax(arrnum);
		System.out.println("maxnum : "+ result);
		
	}
}
