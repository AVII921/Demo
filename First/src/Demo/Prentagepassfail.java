package Demo;
import java.util.Scanner;
public class Prentagepassfail {
	//Write a java program to enter marks of five subjects and calculate total marks and 
	//percentage then check in this conditions.
	public static void main(String[] args) {
		
		  System.out.println("Enter presntsge ");
		  Scanner sc=new Scanner (System.in);
		  int pre =sc.nextInt();
		  
		
		  
		  if (pre>=90)
		  {
			  System.out.println("Grade   A");
		  }
		  
		  else if  (pre>=75)
		  {
			   System.out.println("Grade B");
		  }
		  
		
		  else if  (pre >=50)
		  {
			  System.out.println( "Grade  C");
		  }
	
	  else {
		System.out.println("fail");
	  }
	}
}
	