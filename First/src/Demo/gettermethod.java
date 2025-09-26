package Demo;

public class gettermethod {

	public static void main(String[] args) {
		
		
		 Bus bus = new Bus();
		 
		 bus.setName("anthony");
		 bus.setBusNumber(123);
		 
		 System.out.println(bus.Busnumber);
		 System.out.println(bus.Busname);
	}
		

}


class  Bus
 {
	 int Busnumber ;
	 String Busname;
	 
	 public void setBusNumber(int num)
	 {
		this.Busnumber=num;
	 }
	 public void setName(String name)
	 {
		 this.Busname=name;
	 }
	 
 }

