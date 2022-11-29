import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ViewPosts {
	
	static final String D_URL="jdbc:mysql://localhost:3306/student";
	static final String USER="root";
	static final String password="pass@word1";
	static final String Query= "select first_name,post from user";
	public void fetchAllPosts() {
		
		try(Connection con=DriverManager.getConnection(D_URL, USER, password);
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(Query);){
			while(rs.next()) {
				
				System.out.println("Name: " + rs.getString("first_name"));
				System.out.println("Post : " + rs.getString("post"));
				
				System.out.println();
			}
		}catch(SQLException e) {
			
		}

	}
}
