package practicalday2;

public class Menuprog {
	
	public static void main(String[] args)
	{
		int x;
	do {
		System.out.println("Enter number from 1to7 to see seven days of week:");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
		case 1:{
			System.out.println("MONDAY");
			break;
		}
		case 2:
		{
			System.out.println("TUESDAY");
			break;
		}
		case 3:{
			System.out.println("WEDNESDAY");
		  break;
		}
		case 4:{
			System.out.println("THURSDAY");
		  break;
		}
		case 5:{
			System.out.println("FRIDAY");
		  break;
		}
		case 6:{
			System.out.println("WEEKEND");
			  break;
			}
		case 7:{
			System.out.println("WEEKEND");
		  break;
		}
		default:
		{
			System.out.println("wrong choice!");
		}
		}
		System.out.println("Enter 1 to continue...");
		x=sc.nextInt();
		
	}while(x==1);
	System.out.println("THANKYOU!");
	}
	

}
