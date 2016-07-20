package kr.ac.itschool.practice;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemoMain {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
//		String []arr = {"java","jsp","android","oracle","mssql"};
//		
//		ArrayList<String> str = obj.test(arr);
//		
//		for(int i=0;i<str.size();i++)
//		{
//			String str1=str.get(i);
//			System.out.println(str1);
//		}
		
		String subject = "oracle|mssql|java|jsq|android|html";
//		String []test = new String[6];
//		
//		int index=0;
//		String size=null;
//		for(int i=0;i<5;i++)
//		{	
//			subject =subject.substring(index);
//			test[i]=subject.substring(0,subject.indexOf('|'));
//			size =test[i];
//			index =size.length()+1;
//			System.out.println(test[i]);
//		}
		ArrayListDemo obj = new ArrayListDemo();
		String []arr=obj.subjectMeth(subject);
		 ArrayList<String>list1 =new ArrayList<String>();
		 for(int i=0;i<arr.length;i++)
		 {
			 list1.add(arr[i]);
			 String str=list1.get(i);
			 System.out.println(str);
		 }

	
		 System.out.print("짝수 합 시작 값:");
		 int start = s.nextInt();
		 System.out.print("짝수 합 끝값:");
		 int end = s.nextInt();
		 int i=1;
		 ArrayList<Integer> test = obj.ArrayListDemo(start, end);
		 for(int test1 : test)
		 {	
			 System.out.println(i+"번째 누적수:"+test1);
			 i++;
		 }
	}
}
