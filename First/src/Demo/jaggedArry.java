package Demo;

public class jaggedArry {

	public static void main(String[] args) {
		 int [] [] arr=new int [7] [];
		 int count =1;
		 arr[0]=new int [1];
		 arr[1]=new int [2];
		 arr[2]=new int [3];
		 arr[3]=new int [4];
		 arr[4]=new int [5];
		 arr[5]=new int [6];
		 arr[6]=new int [7];
		 
		 
		  for ( int  i=0; i<7; i++)
		  {
			  for (int  j=0;j<arr[i].length;j++)
			  {
				  arr[i][j]=count;
				  count++;
			  }
			
		  }
		   
		    for ( int i=0; i<7;i++)
		    {
		    	for ( int j=0; j<arr[i].length;j++)
		    	{
		    		System.out.print(arr[i][j]+" ");
		    	}
		    	System.out.println();
		    }
		    System.out.println("*************************");
		    
		     for ( int i=6; i>=0;i--)
		     {
		    	 for ( int j=0;j<arr[i].length;j++)
		    	 {
		    		System.out.print(arr[i][j]+" ");
		    	 }
		    	 System.out.println();
		     }		          		
	}
}
		    
		    