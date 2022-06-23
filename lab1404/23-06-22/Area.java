package calculate;
import java.util.Scanner;
public class Area {
	private int length;
	private int breadth;

	public void setLength(int length) {
		if(length<10 ||length>50)
		{
			System.out.println("Inavlid lenght");
		}
		else {
		this.length = length;
		}
	}

	public int getLength() {
		return length;
	}
	public void setBreadth(int breadth) {
		if(breadth<5 || breadth>20)
		{
			System.out.println("Ivalid breadth");
		}
		else
		{
		this.breadth = breadth;
		}
	}
	public int getBreadth() {
		return breadth;
	}
	
	Area(int length,int breadth)
	{
		 setLength(length);
		  setBreadth(breadth);
	}
	@Override
	public String toString() {
		return " [lenght=" + getLength() + ", Breadth=" + getBreadth() + ", Area="+ getLength()*getBreadth() + "]";
	}
	

}
class calculate{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter length");
	    int length=sc.nextInt();
	    System.out.println("Enter breadth:");
	    int breadth=sc.nextInt();
	    Area obj=new Area(length,breadth);
	     System.out.println(obj);
	}
}
