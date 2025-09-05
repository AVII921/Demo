import java.util.Scanner;
class checkprimenumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the end num :");
		int n = sc.nextInt();
		
		
		   if(n%2!=0 && n%n==0 && n%3!=0){
			
			System.out.println(n+" prime number ");
		}
       else{
			System.out.println(n+" Not prime number");
		}
	}
}

