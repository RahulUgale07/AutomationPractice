package day4.loops;

public class method_largest {
 
	static int largest(int a,int b,int c)
	{
		if(a>b && a>c)
			System.out.println("a is largest"+a);
		else if(b>a && b>c)
			System.out.println("b is largest"+b);
		else 
		System.out.println("c is largest"+c);
		 return (50);
		
	}
	
	
	public static void main(String[] args) {
		method_largest.largest(30,50,80);

	}

}
