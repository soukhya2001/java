package Restaurant;

public class RooftopMain extends ChinaTown {
	public static void main(String[] args) 
	{
		ChooseCafe();
	}
	private static void ChooseCafe()
	{
		RooftopMain obj=new RooftopManage().getRoofTopPoolCafe();
		if( obj!=null)
		{
			obj.welcomeDrink();
		     obj.starter();
			((SwimmingPool) obj).Chill();
			((Rooftop) obj).ambiance();
			obj.soup();
			obj.rice();
			obj.noodles();
			((MughalResturant) obj).chickenTandoori();
			((MughalResturant) obj).chickenChilli();
		}
		
	}

}
