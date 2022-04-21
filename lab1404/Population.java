package labassignment;

public class Population {
public  static void main(String[] args)
{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter Previous Population");
	int prev=sc.nextInt();
	System.out.println("Enter Incresed Population in a decade");
	int dec=sc.nextInt();
	int increased=dec-prev;
	int percentage=(increased/prev)*100;
	int year=(percentage/10);
	System.out.println("Increase of population per Year="+year+" %");
	
	
}
}
