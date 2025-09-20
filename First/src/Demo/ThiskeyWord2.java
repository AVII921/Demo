package Demo;

public class ThiskeyWord2 {

	public static void main(String[] args) {
		
		matrix2  m =new matrix2 ("nashik");
		m.printcity();
		
		
		System.out.println("*************");
		
		matrix2 m2=new matrix2("pume");
		  m2.printcity();
		 
	}

}

 class matrix2 
 {
	 String city;
	 
	 
	 public matrix2(String city_name)
	 {   this.city=city_name;
		 System.out.println("object created ");
	 }
	 
	  public void printcity()
	  {	 // this.city=city_name;
		  System.out.println(this.city);
	  }
 }
