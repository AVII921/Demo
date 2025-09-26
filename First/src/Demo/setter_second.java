package Demo;

public class setter_second {

	public static void main(String[] args) {
		
	Plant plant=new Plant();
	plant.setNumber(100);
	plant.setNumber("mango ");
	System.out.println(plant.number);
	System.out.println(plant.name);
		

	}

}

 class Plant 
 {
	 int  number ;
	 String name ;
	 
	 
	  public void setNumber(int num)
	  {
		  this.number=num;
	  }
	  
	   public void setNumber(String name)
	   {
		   this.name=name;
	   }
 }
