package array;

public class Student {
	
	int roll;
	String name;
    int age;
     Student(int roll,String name,int age)
     {
    	 this.roll=roll;
    	 this.name=name;
    	 this.age=age;
     }
     
     
     
     void display()
     {
    	 System.out.println("Roll no="+roll+ " Name="+name+ "Age="+age);
     }
}
