package Demo;

public class consfive2 {

	public static void main(String[] args) {
		
		Indigo indigo =new Indigo();
		
	}

}
 class Aeroplane 
 {
	 public Aeroplane() 
	 {
		 System.out.println("A");
	 }
	 public Aeroplane (int i)
	 {
		 System.out.println("B");
	 }
 }
 class Indigo extends Aeroplane
 {
	 public Indigo()
	 {
		 System.out.println("Indigo object created");
	 }
	 public Indigo (int i)
	 {
		 System.out.println("Indigo constructor with int called");
	 }
 }