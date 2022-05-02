package hello;

public class reverse {
 public static void main(String[] args)
 {
	 java.util.Scanner sc=new java.util.Scanner(System.in);
	 System.out.println("Enter a String:");
	 String a=sc.nextLine();
	 String[] x=a.split(" ");
	 String arr="";
	 int n=x.length;
	 for(int i=n-1;i>=0;i--)
	 {
		 arr=arr+x[i]+" ";
		 
	 }
	 System.out.println(arr);
	 
	  }
}
