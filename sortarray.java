import java.util.Scanner;
class sortarray{
	public static void main ( String args[]){
		int [] arr={ 9,2,7,5,3,1};
		
		for( int i=0 ; i<arr.length-1 ; i++)
		{
			int minIndex=i;
			{
				for(int j= i+1;j<arr.length; j++)
					if (arr[j] < arr[minIndex])
					{
						minIndex=j;
					}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i]= temp;
		}
		System.out. print("array in ascending order");
		for (int num :arr)
		{
			System.out.print(num+" ");
		}
	}
}

