package bikes;

public class rider {
	String rname;
	int rlno;
	void ride( bike b,String rname,int lno)
	{
		this.rname=rname;
		this.rlno=lno;
		System.out.println("Rider Name: "+rname);
		System.out.println("Rider License Number: "+lno);
		b.start();
		b.move();
		b.stop();
	}

}
