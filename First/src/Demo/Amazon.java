package Demo;

public class Amazon {

	public static void main(String[] args) {
		
		order o=new order("avinash","7499265601","khayde ","7499265601", 10000.0);
		o.delevery();
	
	

	}


}

class order{
	String name ;
	String add;
	String mobail;
	 double price ;
	String pan;
	String aadhar ;
    String vehical ;
    
     public order(String cus_name , String cus_mobail,String cus_add, String cus_aadhar, double cus_price  )
     {
    	  this .name =cus_name ;
    	  this.mobail=cus_mobail;
    	  this.add=cus_add;
    	  this.aadhar=cus_aadhar;  
    	  this .price =cus_price;
    	System.out.println(cus_name);
    	System.out.println(cus_mobail);
    	System.out.println(cus_add);
    	System.out.println(cus_aadhar);
    	System.out.println(cus_price);


    	
     }
     
      public void delevery()
      {
    	  System.out.println("oder delevar ");
    	  
      }
      
  
}