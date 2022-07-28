package DMLOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class Create {
	public static void main(String[] args)
	{
        
		String url="jdbc:mysql://localhost:3306/RXINFOTECH";
		String driver="com.mysql.cj.jdbc.Driver";
		
		Connection con=null;
		
		PreparedStatement pstmt1=null;
		PreparedStatement pstmt2=null;
		PreparedStatement pstmt3=null;
		PreparedStatement pstmt4=null;
		PreparedStatement pstmt5=null;
		String multi_insert="INSERT INTO Employee(E_id,E_name,E_dept,E_sal) VALUES (?,?,?,?) ";
		
		String update="update Employoee set E_dept='hello' ";
		try {
			Class.forName(driver);
			System.out.println("Driver loaded Sucessfully");
			con=DriverManager.getConnection(url,"root","Soukhya@2001");
			pstmt1=con.prepareStatement(multi_insert);
			pstmt2=con.prepareStatement(multi_insert);
			pstmt3=con.prepareStatement(multi_insert);
			pstmt4=con.prepareStatement(multi_insert);
	
			
			pstmt1.setInt(1, 1111);
			pstmt1.setString(2, "Humaira");
			pstmt1.setString(3, "IT");
			pstmt1.setInt(4, 90000);
			
			pstmt2.setInt(1, 1221);
			pstmt2.setString(2, "Priyansh");
			pstmt2.setString(3, "HR");
			pstmt2.setInt(4, 95000);;
			
			pstmt3.setInt(1, 1321);
			pstmt3.setString(2, "Mahenoor");
			pstmt3.setString(3, "Sales");
			pstmt3.setInt(4, 85000);
			
			pstmt4.setInt(1, 1421);
			pstmt4.setString(2, "Arpan");
			pstmt4.setString(3, "Sales");
			pstmt4.setInt(4, 975000);
			
			pstmt1.executeUpdate();
			pstmt2.executeUpdate();
			pstmt3.executeUpdate();
			pstmt4.executeUpdate();
			
			System.out.println("Data Inserted");
			
		     pstmt1=con.prepareStatement(update);
		     pstmt2=con.prepareStatement(update);
		     pstmt3=con.prepareStatement(update);
		     pstmt4=con.prepareStatement(update);
			System.out.println("Data Updated:");
			
			
			
			
		}catch(ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
			
		}
		finally{
			try {
				pstmt1.close();
				pstmt2.close();
				pstmt3.close();
				pstmt4.close();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
