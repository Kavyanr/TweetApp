import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class Retrieve {

	static final String D_URL="jdbc:mysql://localhost:3306/student";
	static final String USER="root";
	static final String password="pass@word1";
	static final String Query= "select email,first_name from user";
	public  void viewAllUsers() {
		
		try(Connection con=DriverManager.getConnection(D_URL, USER, password);
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(Query);){
			while(rs.next()) {
				System.out.println("Email: " + rs.getString("email"));
				System.out.println("Name: " + rs.getString("first_name"));
			//	System.out.println("Password: " + rs.getString("password"));
				
				System.out.println();
			}
		}catch(SQLException e) {
			
		}
   
	}

}
