package listpackage;

import java.util.LinkedList;

public class LinkedListDemo {
	void linkedListMeth(){
		LinkedList<String>lklist = new LinkedList<String>();
		lklist.add("java");
		lklist.add("oracle");
		lklist.add("html");
		lklist.add("jsp");
		for(String lklist1 : lklist){
			System.out.println(lklist1);
		}
	}
}
