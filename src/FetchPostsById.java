import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FetchPostsById {

	static final String D_URL="jdbc:mysql://localhost:3306/student";
	static final String USER="root";
	static final String password="pass@word1";
	
	public Registration getByPostId(String emailId) {
		//List userDetails=new ArrayList<>();
		Registration userDetails=new Registration();
		 try(Connection con=DriverManager.getConnection(D_URL, USER, password);
				   Statement stmt=con.createStatement();
				   ){
			   PreparedStatement ps=con.prepareStatement("select * from user where email= ? ");
			   ps.setString(1, emailId);
			   System.out.println("User details: ");
			   System.out.println();
			  ResultSet rs=ps.executeQuery();
			
			   while(rs.next()) {
				   Registration data=new Registration();
				   data.setEmail(rs.getString("email"));
				   data.setFirst_name(rs.getString("first_name"));
				   data.setPost(rs.getString("post"));
				  // userDetails.add(data);
				   System.out.println("Email: "  + rs.getString("email"));
				   System.out.println("Name: "  + rs.getString("first_name"));
				   System.out.println("Post: "  + rs.getString("post"));
			   }
		   }
			catch(SQLException e)	{
				
			}
		return userDetails;
}
}