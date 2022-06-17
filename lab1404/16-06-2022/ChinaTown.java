package Restaurant;

public class ChinaTown implements ChineseRestaurant {
	public void soup()
	{
		System.out.println("Soup is availabe");
	}
	@Override
	public void noodles()
	{
		System.out.println("Schewan Noodles is Available");
	}
	@Override
	public void rice()
	{
		System.out.println("Schewan Rice is Available");
	}
	void SunlightOffer()
	{
		System.out.println("Special offer on Tuesday you will get Noodles at Rs200 only");
	}
	@Override
	public void welcomeDrink() {
		
		
	}
	@Override
	public void starter() {
	}

}
