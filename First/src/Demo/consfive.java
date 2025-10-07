package Demo;

public class consfive {

	public static void main(String[] args) {
		Indigo indigo=new Indigo();
		
	}

}

class Aeroplane
{
	
	public Aeroplane ()
	{
		System.out.println("Aeroplane invoked.. ");
	}
}
class Indigo  extends Aeroplane 
{
	public Indigo()
	{
	
		this(21);
		System.out.println("Indigo creted  ");
	}
	
	 public Indigo(int i)
	 {
		 System.out.println("hiiiiii.."); 
	 }
}
	
