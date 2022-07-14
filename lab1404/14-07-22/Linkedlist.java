package assign;
import java.util.*;
public class Linkedlist {
	public static void main(String[] args)
	{
	List<Integer>list=new LinkedList<>();
	Scanner sc=new Scanner(System.in);
	int x;
	do
	{
		System.out.println("Enter element");
		int n=sc.nextInt();
		list.add(n);
		System.out.println("Enter 1 to continue/0 to Exit");
		x=sc.nextInt();
		if(x==0)
		{
			System.out.println("---Exit---");

		}
		else if(x!=1)
		{
			System.out.println("Invalid Input Loop Exit:");
		}
	}while(x==1);
	System.out.println("Enter Element to insert at first position");
	x=sc.nextInt();
	list.add(0, x);
	System.out.println(list);
	System.out.println("Enter Element to insert at last Position");
	x=sc.nextInt();
	list.add(list.size(), x);
	System.out.println(list);
	List<Integer>temp=new LinkedList<>();
	 for(int i=list.size()-1;i>=0;i--)
	 {
		 temp.add(list.get(i));
	 }
	  list.clear();
	  list.addAll(temp);
	  System.out.println("-------------------");
	  System.out.println("Reverse list");
	  System.out.println(list);
	
	
	}
}
