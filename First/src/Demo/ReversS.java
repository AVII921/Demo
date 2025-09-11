package Demo;


public class ReversS {

	public static void main(String[] args) {
		
		 String str =new String ("i love java ");
		 
		  for ( int i=str.length()-1;i>=0;i--)
		  {
			  System.out.print(str.charAt(i));
		  }
		 System.out.println();
	
	
		 StringBuilder sb=new StringBuilder("ABCS");
	     System.out.println(sb.reverse().reverse().append("jdbc").isEmpty());
	}
}



