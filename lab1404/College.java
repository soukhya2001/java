package inheriatance;

class College {
	  String x="SNDT";
	  void print()
	{
		System.out.println(x+"College is in Munbai");
	}
}
   class Principal extends College{
	String x="Dr Asha Menon"; 
	   void display()
	  {
		  System.out.println(x+"is a Principal");
  }
 }
   class Teacher extends College{
	public String x="Dr Suchita Bhovar";
	 public void diplay()
	 {
		 System.out.println(x+"is a Teacher");
	 }
 }
  class Student extends College{
	 String x="Neha";
	 void display()
	 {
		 System.out.println(x+"is a Student");
	 }
 }
   class Education{
	   public static void main(String[] args)
	   {
		   Student obj1=new Student();
		   Teacher obj2=new Teacher();
		   Principal obj3=new Principal();
		   obj1.print();
		   obj1.display();
		   obj2.print();
		   obj2.diplay();
		   obj3.print();
		   obj3.display();
		   
	   }
   }