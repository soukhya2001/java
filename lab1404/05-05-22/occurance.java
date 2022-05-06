package hello;

public class occurance {

	public static void main(String[] args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a string:");
		String Sc=sc.nextLine();
		System.out.println("Enter a word to find how many times it occures");
		String x=sc.nextLine();
		String abc[]=Sc.split(" ");
		int count=0;
		for(int i=0;i<abc.length;i++)
		{
		if(x.equals(abc[i]))
		{
			count++;
		}
		}
		System.out.println("the number of occurance of"+x+"=" +count);
		
		
	}
}
