package Demo;

public class setter {

	public static void main(String[] args) {
		
		 System.out.println("creating object :calling conts. ");
		
		 House  house = new House (10,"gurukrupa","maniyar galli");
		 
		 System.out.println(house.house_lane);
		 System.out.println(house.house_number);
		 System.out.println(house.house_name);
		 
		 house.displayhousename();
		 
				 
	}

}
 class House 
 {
	  int house_number ;
	  String house_name ;
	  String house_lane;
	  
	  
	  
	  public House( int number,String name, String lane )
	  {
		 
		   this.house_lane=lane;
		   this.house_number=number;
		   this.house_name=name;
		   
		//  System.out.println("hello ");
	  }
	  
	  public  void displayhousename()
	  {
		  System.out.println("the name  oof  the house is : "+this.house_name);
	  }
	  
 }
 
 