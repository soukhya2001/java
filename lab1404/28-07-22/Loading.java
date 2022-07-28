package Loading;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Loading {
	public static void main(String[] args)
	{
	String url = "jdbc:mysql://localhost:3306/RXINFOTECH";
	String driver = "com.mysql.cj.jdbc.Driver";
	
	try 
	{
		Class.forName(driver);
		System.out.println("Driver loaded successfully");
		
		Connection cn = DriverManager.getConnection(url, "root", "Soukhya@2001");
		System.out.println("Connection established..");
	} 
	
	catch (ClassNotFoundException | SQLException e) {
		
		System.out.println("Problem while loading/connecting the driver ");
		e.printStackTrace();
	}

}
}
