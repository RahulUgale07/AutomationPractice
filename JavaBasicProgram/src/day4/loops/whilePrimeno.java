package day4.loops;

public class whilePrimeno {

	public static void main(String[] args) {
			    int n = 11;
			    if (n <= 1) {
			      System.out.println("The number is not prime");
			      return;
			    }
			    int count = 0;
			    int i = 1;
			    while (i <= n / 2) {
			      if (n % i == 0) {
			        count++;
			      }
			      i++;
			    }

			    if (count > 1) {
			      System.out.println("The number is not prime");
			    } else {
			      System.out.println("The number is prime");
			    }
			  }
			}

