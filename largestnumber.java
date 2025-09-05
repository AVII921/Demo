import java .util.Scanner;
class daysofmonth {
    public static void main ( string [] args){
        scanner = new scanner (system.in);
        system.out.println("enter a number of month");
        int month= sc.nextInt();
		
        int numberofdaysinmonth = 0;
        string monthnumber="unkown";
        switch (month) {
            case 1:
            monthName="january";
            numberofdayinmonth=31;
            break;
            case 2:
            mobtName="february";
            numberofdayinmonth=28;
            break; 
            case 3: 
            mobtName = "march";   
            numberofdayinmonth= 31; 
            break;            
            case 4:           
            mobtName = "April"; 
            numberofdayinmonth=30; 
            break;                 
            case 5:
            mobtName="may"; 
            numberofdayinmonth =31;    
            break;         
            case 6:         
            mobtName= "june";
            numberofdayinmonth =30;
            break;      
            case 7:      
            monthName = "july"; 
            numberofdayinmonth=31;        
            break;                       
            case 8:        
            montName = "august";     
            numberofdayinmonth=31;        
            break;                           
            case 9:          
            montName = "september";     
            mnumberofdayinmonth=30; 
            break;                      
            case 10:   
            montName = "october";  
             numberofdayinmonth= 31;    
            break;                        
            case 11:             
            monthName= "november";    
            numberofdayinmonth = 30; 
            break;                        	
            case 12:
            monthName="decmber";    
            numberofdayinmonth= 31; 
            break;                          
            default:    
            monthnumber=("invalid month");
return;			
            }
	}
}	