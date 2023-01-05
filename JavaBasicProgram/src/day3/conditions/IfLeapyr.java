package day3.conditions;

public class IfLeapyr {

	public static void main(String[] args) {
		int Year = 2022;
		if ((Year % 4 == 0) && (Year % 100 == 0)){
		System.out.println("LEAP YEAR");
		}else {
			System.out.println("NOT LEAP YEAR");
		}
	}

}
