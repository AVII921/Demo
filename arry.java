import java.util.Scanner;
class arry {
	
public static void main ( String args []){
 //int [] abc= { 10,20,30,40};
 //for ( int i: abc)
 //{
//	 System.out.println(i);
 //}
//}
//}

//String [] city ={"pune", "nashik" ,"malegon", "satana"};
//System.out.println(city [1]);
//for ( int i=0 ; i<city.length; i++)
///{
//	System.out.println( city[i]);
//}
//}
//}

Scanner sc = new Scanner ( System.in);
 System.out.println( "enter the length for an array ");
 int size = sc. nextInt();
 
 int [] array1=new int [size ];
 
 System.out.println( "enter the length for an size ");
 
 for ( int i = 0 ; i<size; i++){
	 array1[i]=sc.nextInt();
 }
 for ( int j: array1)
 {
	 
	 System.out.println(j);
 }
 
 
 }
 }
 