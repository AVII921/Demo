package Demo;
import java .util.*;
public class FdigitMdigitLdigit {

	public static void main(String[] args) {
		System.out.println("Enter A Numbwer");
		Scanner sc =new Scanner (System.in);
		int num=sc.nextInt();
		
		int  fd=(num/100);
		 int md=(num/10)/10;
		 int ld=(num%10);
		 int sum =fd+ld;
		 
		  System.out.println("first  digit "+fd);
		  System.out.println("last digit"+ld);
		  System.out.println("middel  digit"+md);
		  System.out.println("sum of first digit and last digit  is  "+sum);
		 
		

	}

}
