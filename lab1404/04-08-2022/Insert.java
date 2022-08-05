package product;
import java.util.*;
import java.sql.*;


public class Insert {
	void insertdata()
	{
	
	Scanner sc=new Scanner(System.in);
	Scanner Sc=new Scanner(System.in);
	
	String insert="Insert INTO products(p_id,p_name,p_type,p_count)Values(?,?,?,?)";
	Connection con=null;
	PreparedStatement pstmt = null;
	int x;
	try {
		pstmt=con.prepareStatement(insert);
		do {
			System.out.println("Enter Product ID:");
			int pid=sc.nextInt();
			
			System.out.println("Enter Product Name:");
			String name=Sc.nextLine();
			
			System.out.println("Enter Product Type:");
			String type=Sc.nextLine();
			
			System.out.println("Enter count of that Product:");
			int count=sc.nextInt();
			
			pstmt.setInt(1, pid);
			pstmt.setString(2,name);
			pstmt.setString(3, type);
			pstmt.setInt(4, count);
			
			pstmt.executeUpdate();
			
			System.out.println("Enter 1 to continue.....");
			System.out.println("Enter 0 to Exit:");
			x=sc.nextInt();
			if(x==0)
			{
				throw new ExceptionZero();
			}
			else if(x!=1)
			{
				throw new ExceptionInvalidInput();
			}
			
		}while(x==1);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		try 
		{
			pstmt.close();
			
		}catch(SQLException e)
		{
			System.out.println(e);
		}
		
	}
	System.out.println("Data Inserted Sucessfully!");
	}
}
