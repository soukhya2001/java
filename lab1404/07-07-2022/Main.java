package Assignment;

public class Main {
	public static void main(String[] args)
	{
		Bean obj1 = new Bean();
		obj1.setName("soukhya");
		Bean obj2=new Bean();
		obj2.setName("soukhya");
		if(obj1.equals(obj2))
		{
			System.out.println("Two objects are equal");
		}
		else
		{
			System.out.println("NOT equal");
		}
		
		
	}

}
