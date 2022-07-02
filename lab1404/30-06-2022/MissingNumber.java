package element;
import java.util.Scanner;
public class MissingNumber {
	public static void missing(int[] arr,int limit)throws Range
	{
		int n=arr.length;
		int j;
		int find=1;
	    for(int i=1;i<=limit;i++)
	    {
	    	for(j=0;j<n;j++)
	    	{ 
	    		if (arr[j]>limit || arr[j]<1)
	    		{
	    			throw new Range(j+1);
	    		}
	    		if(find==arr[j])
	    		{
	    			break;
	    		}
	    	}
	    	if(j==n)
	    	{
	    		System.out.println("Missing element in array"+find);
	    	}
	    	find++;
	    }
	}
	
	public static void repeat(int []arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int find=1;
			if(arr[i]!=-1)
			{
			for( int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=-1;
					find++;
				}
			}
			}
			if(find>1)
			{
				System.out.println(arr[i]+"  present  "+find+" times");
			}
		
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Upper Limit");
		int limit=sc.nextInt();
		System.out.println("Enter Length of Array:");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter element:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
	
		try {
		
			missing(arr,limit);
	        repeat(arr);
		
			
		}catch(Range e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally {
			System.out.println("---End---");
		}
	}

}
