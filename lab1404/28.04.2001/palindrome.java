package assignment;

public class palindrome {
	public static void main(String[] args)
	{
	
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a string: ");
		String a=sc.nextLine();
		String rev="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			
		      rev=rev+a.charAt(i);
		}
		if(a.equals(rev))
		{
			System.out.println("Palindrome:");
		}
		else
		{
			System.out.println("Not palindrome:");
		}
		
	}
	
	{
		
	}
	

}
