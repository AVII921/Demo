package Demo;

public class Setgetmethod {

	public static void main(String[] args) {
		MyEmploye Myemploye= new MyEmploye();
		
		Myemploye.setname("avinash");
		System.out.println(Myemploye.getname());
		
		 Myemploye.setid(21);
		 System.out.println(Myemploye.getid());
		 
		

	}

}
class MyEmploye
{
	 private  int id ;
	private  String name ;
	  
	 public void setname(String n)
	 {
		  this.name =n;
	 }
	 public String getname()
	 {
		 return name ;
	 }
	 public void setid(int i)
	 {
		 this.id =i;
	 }
	 public int getid()
	 {
		 return id; 
	 }
}