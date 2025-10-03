package Demo;

public class inhfrist {

	public static void main(String[] args) {
		
		
		// Human  human=new Human();
		 
		  Human  human=new Avi();
		    human. wolk();
		    human.laugh();
		  
		   //System.out.println(human);
				  
		// human.
				 
//		 Avi  avi=new Avi();
//		 avi.wolk();
//		 avi.laugh();
		
	}

}
 class Human
 {
	  public void wolk()
	  
	  {
		   System.out.println("human  is wolking");
	  }
	  
	   public void laugh()
	   {
		   System.out.println("He is loughin....");
	   }
	  

 }
 
class Avi extends Human
  {
	 public void city()
	 {
		  System.out.println("nashik malegon pune.....");
	 }
	  
	 
 }
 