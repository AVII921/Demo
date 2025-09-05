import java .util.Scanner;
class Sumarray{
		public static void main ( String args[] ){
				Scanner sc = new Scanner (System.in);
				
				System.out. println(" enter the length for an array");
				int size = sc.nextInt();
				int  sum=0;
				int [] array1=new int [size];
			//	long p =1;
				System.out.println( "enter the element for an array ");
				for ( int i =0 ; i<size;i++)
				{
					array1[i]=sc.nextInt();
				}
				for ( int num:array1)
				{
					//sum+=num;
					sum +=num;
				}
				System.out.println("total sum:"+sum);
			}
		}
				
				
				
