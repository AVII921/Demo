package Demo;

public class Palindrome2{

	public static void main(String[] args) {
		
		String str="NAYAN";
		String reversed="null";
		StringBuilder sd=new StringBuilder(str);
		 System.out.print(sd+"   is a palindrome ");
		 
		StringBuilder sb2=new StringBuilder(sd.reverse());
		 reversed=sb2.toString();
		 System.out.println(str.equals(reversed));
		
		
		

	}

}
