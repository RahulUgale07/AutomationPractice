package practice;

public class example1 {
	public static void main(String[] args) {
		String str1 ="MyselfRahul";
		String temp = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			temp = temp + str1.charAt(i);
		}
		System.out.println("str1: " + str1);
		System.out.println("temp: " + temp);//reversed string
	}
}