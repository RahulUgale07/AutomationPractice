package day4.loops;

public class forFabonacci {

	public static void main(String[] args) {
		int n=10,f1=0,f2=1;//f1=first no and f2=2nd no
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(f1 + ", ");

	      // compute the next term
	      int nextTerm =f1 + f2;
	      f1 = f2;
	      f2 = nextTerm;
	    }
	}

}
