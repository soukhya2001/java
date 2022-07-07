package Assignment;
import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Decimal Number:");
		int n=sc.nextInt();
		int arr[]=new int[100];
		int k=0;
		while(n>0)
		{
			int rem=n%2;
			arr[k]=rem;
			k++;
			n=n/2;
			
		}
		for(int x=k-1;x>=0;x--)
		{
			System.out.print(arr[x]);
		}
		


			
		
	}

}
