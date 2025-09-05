import java .util.Scanner;
class swaping2number{
	public static void main ( String args[]){
		Scanner sc= new Scanner ( System.in);
		
		 System.out.print("enter the first number (a):");
		int a =sc. nextInt();
		
        System.out.print("enter the second number (b):");
     	int b =sc. nextInt();
	
	   System.out.println("before Swaping: ");
       System.out.println("a = " + a + ", b = " + b);
	
			int temp =a;
		a=b;
		b=temp;
		System.out.println("after swaping:");
       System.out.println("a = " + a + ", b = " + b);
	}
}
//int num1=5;
//int num2=7;
//
//int temp ;
//
//temp = num1;
//num1 = num2;
//num2 = temp;
//
//System.out.println("After swapping:");
  //      System.out.println("num1 = " + num1 + ", num2 = " + num2);
//}
//}
//		
		
		
		
		
		
