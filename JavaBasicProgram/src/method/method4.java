package method;

public class method4 {
	public static void main(String[] args) {
		System.out.println("Result of addition1: "+getAdditionResult(250.36, 45));
		System.out.println("******************************");
		System.out.println("Result of addition2: "+method4.getAdditionResult(250.36, 45));
		System.out.println("******************************");
		double sum=getAdditionResult(25, 30);
		System.out.println("Sum of two numbers: "+sum);
		double finalResult =sum*100;
		System.out.println("Result after some operation: "+finalResult);
	}
	/*
	 * accessmodifier:static
	 * non-accessmodifier:na
	 * return type:double
	 * methodName:getAdditionResult
	 * argument/parameter:double,double 
	 * return value:double
	 */
	static double getAdditionResult(double num1,double num2) {
		System.out.println("Number1 is: "+num1);
		System.out.println("Number2 is: "+num2);
		double res = num1+num2;
		return res;
	}
}
