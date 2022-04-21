package labassignment;

public class Candidate {
	public static void main(String[] args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter First Candidate Total votes");
		int can1=sc.nextInt();
		System.out.println("Enter Second Candidate Total votes");
		int can2=sc.nextInt();
		System.out.println("Enter Third Candidate Total votes");
		int can3=sc.nextInt();
		int total=can1+can2+can3;
		if(can1>can2 && can1>can3)
		{
			float a=(can1/total)*100;
			System.out.println("First candidate wins with"+a+" votes");
		}
		else if(can2>can1 && can2>can3)
		{
			float  a=(can2/total)*100;
			System.out.println("Second candidate wins with"+a+" votes");
		}
		else if(can3>can1 && can3>can2)
		{
			float a=(can1/total)*100;
			System.out.println("Third candidate wins with"+a+" votes");
		}
		else
		{
			System.out.println("NO One Wins");
		}
		
	}

}
