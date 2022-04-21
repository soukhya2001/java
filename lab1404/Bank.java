package labassignment;

  class Bank {
	void interest()
	{
		System.out.println("The interest rate on Education loan is 7%");
	}

}
   class Manager extends Bank{
	@Override
	void interest()
	{
		System.out.println("The interest rate on Education loan is 6%");
	}
}
    class override extends Manager{
	   public static void main(String[] args)
	   {
	  override obj=new override();
	  obj.interest();
	   }
  }
