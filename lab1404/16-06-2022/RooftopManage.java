package Restaurant;

public class RooftopManage {
	java.util.Scanner sc=new java.util.Scanner(System.in);
	RooftopMain getRoofTopPoolCafe()
	{
		System.out.println("Which Restaurant you want to visit");
		String cafe=sc.nextLine();
		if(cafe.equalsIgnoreCase("Paradise"))
		{
			System.out.println("Welcome to Paradise");
			return RooftopManage();
		}
		else 
		{
			System.out.println("Welcome ChinaTown");
			return RooftopManage();
		}
		
	}
	private RooftopMain RooftopManage() {
		
		return null;
	}

}
