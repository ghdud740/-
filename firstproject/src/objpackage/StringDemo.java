package objpackage;

import java.util.Random;

public class StringDemo {
	void stringMeth(){
		String str1 = new String("aaa");
		String str2 = new String("aaa");
		if(str1.equals(str2))
			System.out.println("같음");
		else
			System.out.println("다름");
		
	}
	void stringFuncTest(){
		String str = "What";
		str = str.concat(" are you doing");
		System.out.println(str);
		str = "javascript.jpg";
		int position = str.indexOf('.');
		System.out.println("po:"+position);
		String result = str.substring(position+1,str.length());
		System.out.println("extention : "+result);
		String result2 = str.substring(0,position);
		System.out.println(result2);
		Random random = new Random();
		System.out.println(random.nextInt(100));
	}
	
}
