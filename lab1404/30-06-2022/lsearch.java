package structure;
 public class lsearch{
  public static int search(int arr[],int find)
  {
	  int i;
	  int n=arr.length;
	  for( i=0;i<n;i++)
	  {
		  if(arr[i]==find)
		  {
			 return i+1;
		  }
		  
	  }
	  return -1;
	  
 }
	public static void main(String[] args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter"+n+"Numbers:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element you want to find:");
		int find=sc.nextInt();
		int l=search(arr,find);	
		if(l==-1)
		{
			System.out.println("Element not found:");
		}
		else {
			System.out.println("Element found at index:"+l);
		}
	}

	
		
	}



