package callbyvalue;

import java.util.Stack;

public class StackDemo {
	
	/*String[] stackMove( Stack stack ){
		String[] strarr = new String[stack.size()];
		int i = 0;
		while(!stack.empty()){
			
			strarr[i] =(String) stack.pop();
			i++;
			
		}
		return strarr;
	}	*/
	
	Stack stackMove( String[] arraystr){
		Stack stack = new Stack();
		for(int i=0; i<arraystr.length; i++){
			stack.push(arraystr[i]);
		}
		return stack;
	}
}
