package Javatest;

public class SwitchDemo {
	public static void main(String[] args){
		int age = 10;
		String result;
			switch (age){
				case 10:
					result = "10 대";
					break;
				case 20:
					result = "20 대";
					break;
				case 30:
					result = "30 대";
					break;
				default:
					result = "40 대 이상";
					break;
			}
			System.out.println(result);
	}
}

