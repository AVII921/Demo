package Demo;

public class Amazon {

	public static void main(String[] args) {
		
		order o=new order("avi","7499265601","khayde ","74444444", 10000.0);
		o.delevery();
		System.out.println(o);
	

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
    	
     }
     
      public void delevery()
      {
    	  System.out.println("oder delevar ");
      }
      
       public String  toString ()
       {
    	    return "oderdetails⇒ " + 
    	    "name "+name+" ,"+
    	    "Mobile: " + mobail + ", " +
            "Address: " + add + ", " +
            "Aadhar: " + aadhar + ", " +
            "Price: " + price;		
    	    		
       }
    
}