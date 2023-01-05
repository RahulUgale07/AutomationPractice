package method;

public class day2_Method0 {
	static void addTwoNum(int a,int b) {//int a=10, int b=20
		int res=a+b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("res: "+res);
		//return;//java complier will write behalf of program for void else you have to type return type
	}
	public static void main(String[] args) {	
		
		addTwoNum(10, 20); //calling function or method
		addTwoNum(100, 200);
		day2_Method0.addTwoNum(101, 202);//classname.methodname(pass value according to data type);
		day2_Method0.addTwoNum(110, 208);
		day2_Method0.addTwoNum(210, 205);
		
//		int x=10,y=20,res;		
//		res=x+y;
//		System.out.println("X: "+x);
//		System.out.println("Y: "+y);
//		System.out.println("res: "+res);
//		
//		x=100;
//		y=200;		
//		res=x+y;
//		System.out.println("X: "+x);
//		System.out.println("Y: "+y);
//		System.out.println("res: "+res);
//		
//		x=101;
//		y=202;		
//		res=x+y;
//		System.out.println("X: "+x);
//		System.out.println("Y: "+y);
//		System.out.println("res: "+res);
//		
//		x=105;
//		y=208;		
//		res=x+y;
//		System.out.println("X: "+x);
//		System.out.println("Y: "+y);
//		System.out.println("res: "+res);
			
	}
}
