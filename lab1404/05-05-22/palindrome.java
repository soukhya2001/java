package Assign5;
public class palindrome {
	static int checkpalindrome(String ss)
	{
		String s=ss.toLowerCase();
		int length=s.length();
		for(int i=0;i<=length/2;i++)
		{
			if(s.charAt(i)!=s.charAt(i-length-1))
			{
				return -1;
			}
		}
		return 1;
	}
		
	
	public static void main(String[] args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String[]arr=s.split(" ");
		int count=0;
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			if (checkpalindrome(arr[i])==1)
			{
				count++;
				
			}
			
		}
		System.out.println(count);
		

		}

}
