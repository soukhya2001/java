package assignment;

public class sum {

	public static void main(String[] args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter alpha Numberic String:");
		String a=sc.nextLine();
		int Sum = 0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)>='0' && a.charAt(i)<'9' )
			{
				Sum=Sum+(a.charAt(i)-'0');
			}
		}
		System.out.println("Sum of Digit="+Sum);
		
	}
}
