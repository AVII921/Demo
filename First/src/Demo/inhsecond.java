package Demo;

public class inhsecond {

	public static void main(String[] args) {
		// Animal animal=new Animal();
		 // Tiger tiger =new Tiger ();
		  BengaliTiger bt =new BengaliTiger();

	}

}


class Animal
{
	 
	public  Animal()
	{
		 System.out.println("Invoked...");
	}
    public void Demo ()
	 {
		 System.out.println("From animal");
	 }
	
}
class Tiger extends Animal
{
	  public Tiger ()
	  {
		  System.out.println("Tiger invoked ");
	  }
}
class BengaliTiger extends Tiger
{
	public BengaliTiger()
	{
		System.out.println("BengaliTiger ");
	}
}