package Demo;

public class ConstructorAnimal {

	public static void main(String[] args) {
		
		 tiger Tig= new tiger("wagh",120,'T');
		 
	

	}

}

class tiger
{
	   public tiger()
	   {
		   System.out.println("non - pram");
	   }
	   
	    public  tiger(String i,int j,char c)	    
	    {
	    	System.out.println(i+"prama");
	    	System.out.println(j);
	    	System.out.println(c);
	    }
	    
	     public tiger(int i,int j)
	     {
	    	 
	    	 System.out.println(i+j);
	     }
	     
	      public tiger(String abc)
	      {
	    	  System.out.println("abc");
	      }
	  
	  
  }
