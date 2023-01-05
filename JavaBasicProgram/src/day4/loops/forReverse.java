package day4.loops;

public class forReverse {

	public static void main(String[] args) {
	 int remainder=0,reverse=0,number=12345;
	    
	     
	     for(;number != 0; number=number/10)     
		{  
		remainder = number % 10;
		reverse = reverse * 10 + remainder;  
		 }  
		System.out.println("The reverse of the given number is: " + reverse);  

	}

}