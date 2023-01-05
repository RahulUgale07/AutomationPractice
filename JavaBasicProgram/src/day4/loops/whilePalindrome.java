package day4.loops;

public class whilePalindrome {

	public static void main(String[] args) {
		int remainder=0,reverse=0,number=12321;
        int temp=number;   
		while(number != 0)     
		{  
		remainder = number % 10;  
		reverse = reverse * 10 + remainder; 
		number=number/10;
		 }  
		System.out.println("The reverse of the given number is: " + reverse);
	
		if(temp==reverse){
	    	System.out.println("The  number is palinddrom "+temp);
	    }else 
	    	System.out.println("The  number is  not palinddrom "+temp);

	}

}
