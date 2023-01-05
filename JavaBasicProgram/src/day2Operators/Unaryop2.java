package day2Operators;

public class Unaryop2 {

	public static void main(String[] args) {
		int a = 55, b;
		b = a++;//b=56
		int x = a, y;//x=56
		System.out.println(x);// 56
		y = ++x;// x=57
		System.out.println("a : " +a);// 
		System.out.println("b : " +b);// 
		System.out.println("x : " +x);//57 
		System.out.println("y : " +y);// 57

		int p = -10, q = 20, res;

		res = p++ + --q;// res = 
		System.out.println("res: " + res);// 
		System.out.println("p: " + p);// 
		System.out.println("q: " + q);// 
		System.out.println("*****************************");
		int res1 = ++p + ++q;// res1 =
		System.out.println("res1 = " +res1);// 
		System.out.println("p: " + p);// 
		System.out.println("q: " + q);//

	}

}
/* see all the operations performed on variable before println line then decide
*/