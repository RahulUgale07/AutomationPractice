package day4.loops;

public class swapping {

	public static void main(String[] args) {
		//  swapping two numbers 
		int num1=30,num2=50,temp;
            System.out.println("num1 ="+num1);
            System.out.println("num2 ="+num2);
            temp=num1;
            num1=num2; //by using 3 variables
            num2=temp;
	  /* num1=num1+num2; //30+50=80(new num1)
       num2=num1-num2;//80-50=30(new num2)
       num1=num1-num2;//80-30=50(new num1)swapped without using 3rd variable
	*/
            System.out.println("num1 ="+num1);
            System.out.println("num2 ="+num2);
	}

}
