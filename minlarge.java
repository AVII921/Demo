import java.util.Scanner;
class minlarge {
	public static void main ( String args[]){
		
		Scanner sc = new Scanner( System.in);
		System.out.println(" Enter the number of elements:");
		int n = sc.nextInt();
		
         int[] num = new int[n];

		
		System.out.println("Enter the elements:");
		for ( int i=0;i<n; i++){
			num[i]=sc.nextInt();
		}
		
		int min=num[0];
		for ( int i=1; i< n ; i++)
		{
			if (num[i] < min)
			{
				min=num[i];
			}
		}
		System.out.println(" smallest element :"+min);
		
		 
	}
}

