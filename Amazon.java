package newp;

public class Amazon {
     String z=Watch;
    
      public type()
     {
    	 System.out.println("Types of "+z);
     }
     
}
public class Watches extends Amazon{
	
	String a="citizen";
	String b="Titan";
	String c="Fastrack";
	  public Brand()
	  {
		  System.out.println("Brand"+a);
		  System.out.println("Brand"+b);
		  System.out.println("Brand"+c);
	  }
}
public class Material extends Watches{
	  String a="Ceramic";
	  String b="Leather";
	  String c="Stainless steel";
	      public Band()
	      {
	    	  System.out.println("Band"+a);
	    	  System.out.println("Band"+b);
	    	  System.out.println("Band"+c);
	      }
}
 

	 public class Product{
		  public static void main(String [] args)
		  {
			  Product obj=new Product();
			  obj.type();
			  obj.Brand();
			  obj.();
		  }
	  }
}
