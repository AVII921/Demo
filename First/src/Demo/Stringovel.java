package Demo;

public class Stringovel {

	public static void main(String[] args) {
		 String  str=new String ("avinashkhairnmarfrommalegondistnashik");
		 
		   for ( int i=0; i<str.length(); i++)
		   {
			   if (str.charAt(i)=='e' || str.charAt(i)=='o')
			   {
				   System.out.print(i);// system.out.println(str.charAt(i));
			   }
			   else 
			   {
				   System.out.print(str.charAt(i));
				  
			   }
		   }

	}

}
 