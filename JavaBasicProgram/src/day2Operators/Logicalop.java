package day2Operators;

public class Logicalop {

	public static void main(String[] args) {
		//variables initialization and declaration
     boolean bool1=true,bool2=true;
   //Logical AND
     System.out.println("bool1 && bool2 = "+ (bool1 && bool2));
   //Logical OR 
     System.out.println("bool1 || bool2 = "+ (bool1 || bool2));
   //Logical NOT
     System.out.println("!(bool1 && bool2) = "+ !(bool1 && bool2));
     System.out.println("***********************************");
     boolean bool3=true,bool4=false;
     //Logical AND
       System.out.println("bool3 && bool4 = "+ (bool3 && bool4));
     //Logical OR 
       System.out.println("bool3 || bool4 = "+ (bool3 || bool4));
     //Logical NOT
       System.out.println("!(bool3 && bool4) = "+ !(bool3 && bool4));
       System.out.println("***********************************");
       boolean bool5=false,bool6=false;
       //Logical AND
         System.out.println("bool5 && bool6 = "+ (bool3 && bool4));
       //Logical OR 
         System.out.println("bool5 || bool6 = "+ (bool3 || bool4));
       //Logical NOT
         System.out.println("!(bool5 && bool6) = "+ !(bool3 && bool4));
	}

}
 