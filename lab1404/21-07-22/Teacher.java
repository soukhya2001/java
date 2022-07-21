package Demo;
import java.util.*;
public class Teacher {
	 private String name;
	 private String sub;
	@Override
	public int hashCode() {
	 return Objects.hash(name,sub);
	}
	@Override
	public boolean equals(Object obj) {
		Teacher x=(Teacher)obj;
		return Objects.equals(name,x.name) &&Objects.equals(sub,x.sub);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	Teacher(String name,String sub)
	{
		this.name=name;
		this.sub=sub;	
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", sub=" + sub + "]";
	}
	

}
class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner Sc=new Scanner(System.in);
		
	
		int x;
		 HashMap<Teacher,Integer>hash=new LinkedHashMap<Teacher,Integer>();
         try {
		 do {
			System.out.println("Enter Teacher Name");
			String name=sc.nextLine();
			System.out.println("Enter Subject");
			String sub=sc.nextLine();
			Teacher obj=new Teacher(name,sub);
			hash.put(obj,1);
			System.out.println("Enter 0 to continue..");
			System.out.println("Enter 1 to Exit");
			x=Sc.nextInt();
			if(x==1)
			{
				throw new ExcepExit();
			}
			else if(x!=0)
			{
				throw new Excepwrong();
			}
			
			
		}while(x==0);
         }
		 catch(Exception e)
         {
        	 System.out.println();
        	 
         }

         System.out.println(hash);
         
		 System.out.println("Enter teacher name you want to delete");
		 String tname=sc.nextLine();
		 System.out.println("Enter Subject;");
		 String tsub=sc.nextLine();
		 Teacher t=new Teacher(tname,tsub);
		 if(hash.containsKey(t))
		 {
			 hash.remove(t);
		 }
		 else
		 {
			 System.out.println("Invalid teacher name and subject");
		 }
	    
	   System.out.println(hash);
	 
	
	 
	}
}
