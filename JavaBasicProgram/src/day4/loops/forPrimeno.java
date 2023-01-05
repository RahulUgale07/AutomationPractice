package day4.loops;

public class forPrimeno {

	public static void main(String[] args) {
		int count=0,n=79;
		for (int i = 1; i <= n; i++) {
		      if (n % i == 0) {
		        count++;
		         }
		    }

		    // If the number of factors is greater than 1,
		    // the number is not prime.
		    if (count == 2) {
		        System.out.println("The number is  prime");
		    }
		    else {
		      System.out.println("The number is not prime");

	}
	}
}
