package Demo;
import java.util.Scanner;
public class C_S_M_Hours {

	public static void main(String[] args) {
		 System.out.println("Enter  A Seconds");
		 Scanner sc=new Scanner(System.in);
		 int sec = sc.nextInt();
		 int mini = (sec % 3600)/60;
		 int hours= sec / 3600;
		 System.out.println(" Time is "+hours+"Hours  "+mini+"Minutes  "+sec+"seconds");

	
	}
}
		
		 
		