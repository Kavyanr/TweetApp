import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserRegistration {
	
 static Registration register =new Registration();
 static final String D_URL="jdbc:mysql://localhost:3306/student";
	static final String USER="root";
	static final String password="pass@word1";
	static final String Query= "insert into user (email,first_name,password,post) values(?,?,?,?);";
 
 public Registration register(Registration data) {
	try(Connection con=DriverManager.getConnection(D_URL, USER, password);
					Statement stmt=con.createStatement();
					PreparedStatement ps=con.prepareStatement(Query);){
				
				
				ps.setString(1, data.getEmail());
				ps.setString(2, data.getFirst_name());
				ps.setString(3, data.getPassword());
		        ps.setString(4, data.getPost());
				int result =ps.executeUpdate();	
				
				if(result==0)
					System.out.println("Already exists");
				else 
					System.out.println("Registered successfully");
				
			}catch(SQLException e) {
				
			}
return data;

	}

 
 public Registration getUserByUsername(String username) {
     Registration user = new Registration();
     try(Connection con=DriverManager.getConnection(D_URL, USER, password);
				Statement stmt=con.createStatement();
				PreparedStatement ps=con.prepareStatement("select * from user where first_name=?");)
     {
         ps.setString(1, username);
         ResultSet rs = ps.executeQuery();

         if (rs.next()) {
             user.setEmail(rs.getString("email"));
             user.setFirst_name(rs.getString("first_name"));
             user.setPassword(rs.getString("password"));
             user.setPost(rs.getString("post"));
         }
     } catch (SQLException e) {
         e.printStackTrace();
     }

     return user;
 }
 
 
}
