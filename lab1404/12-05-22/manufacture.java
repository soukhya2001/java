package bikes;

public class manufacture {
   bike get()
   {
	   java.util.Scanner sc=new java.util.Scanner(System.in);
	   System.out.println("Enter bike name:");
	   String bname=sc.nextLine();
	   if(bname.equalsIgnoreCase("yamaha"))
		   {
		     return new yamaha();

		   }
	   if(bname.equalsIgnoreCase("hero"))
	   {
		   return new hero();
	   }
	   else {
	return null;
	   }
	   
   }
}
