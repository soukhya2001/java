package Assignment;

public class ThreadMain {
	public static void main(String[] args)
	{
		Mythread obj=new Mythread();
		Thread t=new Thread(obj);
		t.start();
		t.start();
	}

}
