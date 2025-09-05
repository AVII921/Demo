import java.util.Scanner;
class days_of_month{
	public static void main( String[]args){
		 
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter the month number");
		  int month= sc.nextInt();
		  
		  int number_of_days_in_month=0;
		  String monthname="unknow month";
		  
		  
		  
		  switch(month){
			case 1:
			          monthname="january";
					  number_of_days_in_month=31;
					  break;
					  
			case 2:
					monthname="february";
					number_of_days_in_month=28;
					break;
			case 3:
					monthname= "march";
					number_of_days_in_month=31;
					break;
					
			case 4:
			          monthname="april";
					  number_of_days_in_month=30;
					  break;			

			case 5:
			          monthname="may";
					  number_of_days_in_month=31;
					  break;
					  
					  
			case 6:
			          monthname="june";
					  number_of_days_in_month=30;
					  break;
					  
		    case 7:
			          monthname="july";
					  number_of_days_in_month=31;
					  break;
					  
			case 8:
			          monthname="august";
					  number_of_days_in_month=31;
					  break;
					  
			case 9:
			          monthname="september";
					  number_of_days_in_month=30;
					  break;
					  
			case 10:
			          monthname="october";
					  number_of_days_in_month=31;
					  break;
					  
			case 11:
			          monthname="novembre";
					  number_of_days_in_month=30;
					  break;
					  
			case 12:
			          monthname="december";
					  number_of_days_in_month=31;
					  break;
					  
			default:	
					monthname = "invalid month    ";
		  }
	          System.out.println( monthname+" "+"days"+ number_of_days_in_month);
	}
}