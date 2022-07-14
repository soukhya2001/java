package assign;

import java.util.*;

public class Emp {
	private String Emp_name;
	private String dept;
	Emp(String Emp_name,String dept)
	{
		this.Emp_name=Emp_name;
		this.dept=dept;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
class Main{
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 ArrayList<Emp>arr=new ArrayList<>();
		  for(int i=0;i<5;i++)
		  {
			  System.out.println("Enter Name");
			  String name=sc.nextLine();
			  System.out.println("Enter Department");
			  String dept=sc.nextLine();
			  Emp obj=new Emp(name,dept);
			  arr.add(obj);
			  
		  }
		  
			  for(Emp x:arr)
			  {
				  System.out.println(x.getEmp_name()+" "+x.getDept());
			  }
		  
		     Set<String>set=new HashSet<>();
		     for(Emp x:arr)
		     {
		    	 set.add(x.getEmp_name()+x.getDept());
		     }
		     System.out.println("------------");
		     System.out.println("After Deleting Duplicates");
		     for(String x:set)
		     {
		    	 System.out.println(x);
		     }
		 
		 
	 }
 }
