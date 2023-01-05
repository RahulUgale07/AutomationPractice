package day4.loops;

public class uppercaselower {

	public static void main(String[] args) {
		System.out.println("******************************");
		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.print(c1+" ");
		}
		System.out.println("\n******************************");
		for (char c1 = 'A'; c1 <= 'Z'; c1++) {
			System.out.print(c1+" ");
		}
		
	}
	
}
//here declaring 'a' as char is imp cause a has Ascii value based on which it increment or decrements
/*System.out.println("********************Ascii Value************************");
for (char c1 = 'a'; c1 <='z'; c1++) {
	int asciiValue=c1;
	System.out.println(c1+": "+asciiValue);
*/