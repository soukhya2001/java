package hello;

class employee {
   int employeeId;
  String employeeName;
  String employeeAddress;
  int employeephone;
  double basicSalary;
  double specialAllowance=250.80;
  double hra=1000.50;
  employee(int id,String name,String address,int phone){
	  this.employeeId=id;
	  this.employeeName=name;
	  this.employeeAddress=address;
	  this.employeephone=phone;
  }
  void calculateSalary()
  {
	  double sal=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
	  System.out.println("Salary="+sal);
  }
  void calculateTransport()
  {
	  double trans=10/(100*basicSalary);
	  System.out.println("Transport Allowance="+trans);
  }
}
class manager extends employee{

	manager(int id,String name,String address,int phone,double salary)
	{  
		super(id, name, address, phone); 
		this.basicSalary=salary;
	      
	}
	@Override
	void calculateTransport()
	{
		double trans=15*(basicSalary/100);
		System.out.println("Transport Allowance="+trans);
	}
}
class trainee extends employee{
	trainee(int id,String name,String address,int phone,double salary)
	{
		super(id,name,address,phone);
		this.basicSalary=salary;
	}
}
class inheritanceActivity{
	public static void main(String[] args)
	{
		manager obj=new manager(126534,"Peter","Chennai",237844,65000);
		obj.calculateSalary();
		trainee obj1=new trainee(29846,"Jack","Mumbai India",442085,45000);
		obj1.calculateSalary();
		obj.calculateTransport();
		obj1.calculateTransport();
		
		
	}
}