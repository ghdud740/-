package callbyvalue;

import java.util.Stack;

public class StackDemoMain {

	public static void main(String[] args) {
		
	StackDemo obj = new StackDemo();

	/*	stack.push("java");
		stack.push("oracle");
		stack.push("jsp");
		stack.push("html");

		String[] arr = obj.stackMove(stack);
		for(String result : arr){
			System.out.println(result);
		}
		*/
		String [] arraystr = {"java","html5","android","jQuery","MySQL"};
		Stack stack1= obj.stackMove(arraystr);
		while(!stack1.empty()){
			System.out.println(stack1.pop());
		}
		String today = customutil.CustomDateFormat.mydateFormat();
		StringBuffer date = new StringBuffer();
		date.append(today.substring(0, 4)+"년");
		date.append(today.substring(5, 7)+"월");
		date.append(today.substring(8, 10)+"일 ");
		date.append(today.substring(11, today.length()));
		System.out.println(date);
	}
}
