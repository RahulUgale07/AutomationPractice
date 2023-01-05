package day3.conditions;

public class IfLargestno {

	public static void main(String[] args) {
		int num1=45,num2=100,num3=89;
		if (num1 > num2 && num1 > num3) 
           System.out.println("num1 is largest = " +num1);
		else if(num2>num1 && num2>num3)
		System.out.println("num2 is largest = " +num2);
		else 
			System.out.println("num3 is largest = " +num3);
		  
	}
}
