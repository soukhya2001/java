package hello;

class hod{
     int phone=123456;
   
     void display()
     {
    	 System.out.println("phone number="+phone);
     }
 
}
class teacher extends hod{

	int phone;
	teacher(int phone)
	{
		this.phone=phone;
	}
	void display()
	{
		System.out.println("phone number"+phone);
	}
}
 class Main{
	 public static void main(String[] args)
	 {
		 java.util.Scanner sc=new java.util.Scanner(System.in);
		 System.out.println("Enter phone number:");
		 int a=sc.nextInt();
		 teacher obj=new teacher(a);
		 obj.display();
	 }
 }
