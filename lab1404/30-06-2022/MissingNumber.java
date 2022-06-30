package element;
import java.util.Scanner;
public class MissingNumber {
	public static int missing(int []arr)
	{
		int n=arr.length;
		int find=1;
		int j;
		for(int i=0;i<n;i++)
		{
			for( j=0;j<n;j++)
			{
				if(arr[j]==find)
				{
					break;
				}
			}
			if(j==n)
			{
				return find;
			}
			find++;
		}
		return 0;
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Array:");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter element:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int element=missing(arr);
		System.out.println("Missing Element"+element);
		
	}

}
