package day4.loops;

public class forCountDigit {

	public static void main(String[] args) {
		 int count = 0,num;

		    for(num=12345 ;num != 0; num=num/10) {
		    count =count+1;
		    }

		    System.out.println("Number of digits: " + count);
	}

}
