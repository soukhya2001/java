package bikes;

public class Main {
   public static void main(String[] args)
   {
	   java.util.Scanner sc=new java.util.Scanner(System.in);
	   System.out.println("Enter your name:");
	   String name=sc.nextLine();
	   System.out.println("Enter your license Number:");
	   int lno=sc.nextInt();
	   rider obj=new rider();
	   bike obj2=new manufacture().get();
	   if(obj2!=null)
	   {
		   obj.ride(obj2, name, lno);
		   engine e=new engine();
		   wheel w=new wheel();
	   }
	   else
	   {
		   System.out.println("bike not available");
	   }
	   
   }

}
