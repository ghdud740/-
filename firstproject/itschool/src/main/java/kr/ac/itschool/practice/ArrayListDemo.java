package kr.ac.itschool.practice;
import java.util.ArrayList;
class ArrayListDemo {
//	 ArrayList<String> test(String arr[])
//	 {
//		 ArrayList<String> test= new ArrayList();
//		 
//		 for(int i=0;i<arr.length;i++)
//		 {
//			 test.add(arr[i]);
//		 }
//		 return test;
//	 }

	 String[] subjectMeth(String subject){
		 String arr[]=subject.split("[|]");
	return arr;
	 }
	 
	ArrayList<Integer> ArrayListDemo(int a,int b)
	 {
		 ArrayList<Integer> test = new ArrayList();
		 int i;
		 int result=0;
		 for(i=a;i<=b;i++)
		 {
			 if(i%2==0)
			 {
				 result+=i;
				 test.add(result);
		 }
		 	 }
		 return test;
	 }

 
	}
