package Demo;

public class inhthird {

	public static void main(String[] args) {
		Demo d =new Demo();
		 // System.out.println(d.id);
		

	}

}
class Demo
{ int id; ;
	
	 public Demo()
	 {
		 this(19 ,22);
		  System.out.println("one");
		  id =129;
	 }
	 
	 
	 public  Demo ( int i)
	 {
		// this(100,200);
		  System.out.println("Two");

	 }
	 
	 
	  public  Demo (int i ,int j)
	  {
		  this(200);
		   System.out.println("three");
	  }
}
