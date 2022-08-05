package product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class ProductMain {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String url="jdbc:mysql://localhost:3306/product";
		String driver="com.mysql.cj.jdbc.Driver";
		

		
		
		try {
		
			Class.forName(driver);
			System.out.println("Driver Loaded..Successfully!");
			
		   Connection con=DriverManager.getConnection(url,"root","Soukhya@2001");
			System.out.println("Connection Established"); 
			System.out.println("-----------------------");
			try
			{
			System.out.println("Enter 1 to create:");
			System.out.println("Enter 2 to Insert:");
			System.out.println("Enter 3 to Update");
			System.out.println("Enter 4 to Delete:");
			System.out.println("====> Enter your choice <====");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				
			}
			case 2:
			{
				Insert obj=new Insert();
				obj.insertdata();
				break;
			}
			case 3:
			{
				break;
			}
			case 4:
			{
				
			}
			default:
			{
				throw new ExceptionInvalidInput();
			}
			
			}
			}
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
			
			
			
		}catch(ClassNotFoundException | SQLException e) 
		{
			System.out.println(e);
		}
			
		
	}

}
