import java.util.Scanner;

 class Fact {
    public static void main(String[] args) {
      
        Scanner obj = new Scanner(System.in);
		
        System.out.print("Enter a number to find the factorial: ");
        int num = obj.nextInt();
        
       int result=1;
        for (int i = 2; i <= num; i++) 
	{
          result *= i;  
        }
        System.out.println("Factorial of " + num + " is: " + result);
        
    }
}


// import java.util.Scanner;

// class Fact {
//     public static void main (string[]args) {

//         Scanner obj=new Scannerc(System.in);

//         System.out.println("enter a number to find the factorial:");
//         int num = obj.nextInt();

//         int result=1;
//         for (int i = 2; i<=num; i++;)
//         {
//             result*=i;

//         }
//         System.out.println("factorial of "+ num + " is: " + result);
//     }
// }