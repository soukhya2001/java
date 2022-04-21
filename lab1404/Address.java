package labassignment;

class Address { 
	int hno;
	String lname;
	int pin;
	int post;
	Address(int hno,String lname,int pin,int post)
	{
		this.hno=hno;
		this.lname=lname;
		this.pin=pin;
		this.post=post;
	}
}
class Person
{
	String name;
	int phone;
	Address add;
	Person(String name,int phone,Address add)
	{
		this.name=name;
		this.phone=phone;
		this.add=add;
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Phone Number="+phone);
		System.out.println("Address= house no-"+add.hno+"lane name-"+add.lname+"pin number-"+add.pin+"Post office number-"+add.post);
}
	}
	class  Check{
		public static void main(String[] args)
		{ 
			int x=1;
			while(x<=3)
			{
			java.util.Scanner sc= new java.util.Scanner(System.in);
			System.out.println("Enter Your name");
			String name=sc.nextLine();
			System.out.println("Enter Your Phone number");
			int phone=sc.nextInt();
			System.out.println("Enter Your House number:");
			int house=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Your Lane Name:");
			String lane=sc.nextLine();
			System.out.println("Enter Your Pin-code:");
			int pin=sc.nextInt();
			System.out.println("Enter Your Post-office Number:");
			int post=sc.nextInt();
		 Address add1=new Address(house,lane,pin,post);	
		
		Person obj1=new Person(name,phone,add1);
	
		obj1.display();
		System.out.println("***********************");

		x++;
		}}
	}
