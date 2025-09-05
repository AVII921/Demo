import java.util.Scanner;
class array0{
	public static void main ( String args[])
	{
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner( System.in);
		int size= sc.nextInt();
		int number[] = new int [size];
		
		for ( int i=0; i<size;i++)
		{
			number [i]=sc.nextInt();
		}
		
		for ( int i=0; i<size; i++)
		{
			System.out.println(number[i]);
		}
		
	}
}
