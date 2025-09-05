import java.util.Scanner;
class star55{
	public static void main (String[] args){

	
	
		 int rows =5;
	     int column =5;
	 
	 
		 for( int i =1; i<=rows; i++){
			 for ( int j=1; j<=column;j++){
			 
			 if (i==1 || i==5 || j==1 || j==5){
					 System.out.print("*");
				 }
				 else{
			 System.out.print(" ");
				 }
		    }
			System.out.println();
		 }
	}
  }


