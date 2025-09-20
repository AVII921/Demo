package Demo;

public class ThisKeyWord {

	public static void main(String[] args) {
		matrix m =new matrix();
		System.out.println(m.hashCode());
		
		System.out.println("******************");
		
		matrix m2=new matrix();
		System.out.println(m2.hashCode());
		
		
		
	}

}

 class matrix{
	  String  city ;
	  
	  public matrix()
	  {
		  System.out.println("object creted ");
		   System.out.println(this.hashCode());
	  }
 }
