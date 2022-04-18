package newp;

class Amazon {
     String z="Watch";
    
      void type()
     {
    	 System.out.println("Types of "+z);
     }
     
}
 class Watches extends Amazon{
	
	String a="citizen";
	String b="Titan";
	String c="Fastrack";
	  void Brand()
	  {
		  System.out.println("Brand"+a);
		  System.out.println("Brand"+b);
		  System.out.println("Brand"+c);
	  }
}
 class Material extends Watches{
	  String a="Ceramic";
	  String b="Leather";
	  String c="Stainless steel";
	      void Band()
	      {
	    	  System.out.println("Band"+a);
	    	  System.out.println("Band"+b);
	    	  System.out.println("Band"+c);
	      }
}
 

	 class Product extends Material {
		  public static void main(String [] args)
		  {
			  Product obj=new Product();
			  obj.type();
			  obj.Brand();
			  obj.Band();
		  }
	  }
	 }
