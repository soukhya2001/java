package array;

public class Main {
 public static void main(String[] args)
 {
	 java.util.Scanner sc=new java.util.Scanner(System.in);
	 java.util.Scanner SC=new java.util.Scanner(System.in);
	  
	 System.out.println("Enter how many students data you want enter");
	  int n=sc.nextInt();
	  
	  Student []obj=new Student[n];
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println("Enter student roll no:");
	    	int roll=sc.nextInt();
	    	System.out.println("Enter student name");
	    	String name=SC.nextLine();
	   
	    	System.out.println("Enter student age:");
	    	int age=sc.nextInt();
	    	obj[i]=new Student(roll,name,age);
	    }
	    
	    
	    for(int i=0;i<n;i++)
	    {
	           obj[i].display();
	    }
	  }
}
