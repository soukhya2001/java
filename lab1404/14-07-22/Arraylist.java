package assign;
import java.util.*;
public class Arraylist {
	public static void main(String[] args)
	{
		ArrayList<Integer>arr1=new ArrayList<>();
		ArrayList<Integer>arr2=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter element in first ArrayList");
		do
		{
			System.out.println("Enter element");
			int a=sc.nextInt();
			arr1.add(a);
			System.out.println("Enter 1 to continue/0 to Exit");
			 x=sc.nextInt();
			if(x==0)
			{
				System.out.println("---Exit---");
				
			}
			else if(x!=1)
			{
				System.out.println("Invalid input Loop Exit");
			}
			
		}while(x==1);
		System.out.println("Enter element in second ArrayList");
		do
		{
			System.out.println("Enter element");
			int a=sc.nextInt();
			arr2.add(a);
			System.out.println("Enter 1 to continue/0 to Exit");
			 x=sc.nextInt();
			if(x==0)
			{
				System.out.println("---Exit---");
				
			}
			else if(x!=1)
			{
				System.out.println("Invalid input Loop Exit");
			}
			
		}while(x==1);
			if(arr1.containsAll(arr2))
			{
				System.out.println("Equal");
			}
			else
			{
				System.out.println("Not Equal");
			}
			
			
			
			
				
		
	}

}
