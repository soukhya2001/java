package hello;

public class array {
	static void checkmin(int arr[])
	{
		 int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			
		}
		System.out.println("MINIMUM Value="+min);
		
	}
	static void checkmax(int arr[])
	{
		 int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		System.out.println("Maximum Value="+max);
		
	}
	 public static void main(String [] args)
	 {
		 int arr[] =new int[5];
		 java.util.Scanner sc=new java.util.Scanner(System.in);
		 System.out.println("Enter Elements");
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 checkmin(arr);
		 checkmax(arr);
	 }
	 

}
