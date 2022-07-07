package Assignment;

public class Bean {
  private int Emp_id;
  private String name;
  private double salary;
  private String department;
  Bean(){};
   Bean(int Emp_id,String name,double salary,String department)
   {
	   this.Emp_id=Emp_id;
	   this.name=name;
	   this.salary=salary;
	   this.department=department;
   }
public int getEmp_id() {
	return Emp_id;
}
public void setEmp_id(int emp_id) {
	Emp_id = emp_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
   
  
}
