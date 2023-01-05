package day4.loops;

public class whileReverse {

	public static void main(String[] args) {
		int remainder=0,reverse=0,number=12345;
	    
	     
	     while(number != 0)     
		{  
		remainder = number % 10;  
		reverse = reverse*10 + remainder; 
		number=number/10;
		 }  
		System.out.println("Reverse of the given number is: " +reverse);

	}

}
