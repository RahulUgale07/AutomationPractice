package day4.loops;

public class palindrome {

	public static void main(String[] args) {
	int num=12345,rev=0,rem=0;
    int temp=num;
    for(;num >0;num=num/10) {
    	rem=num%10;
    	rev=rev*10+rem;
    	
	}
    System.out.println("Reverse no is "+rev);
    if(temp==rev){
    	System.out.println("The  number is palinddrom "+temp);
    }else
    	System.out.println("The  number is  not palinddrom "+temp);
    }
}
