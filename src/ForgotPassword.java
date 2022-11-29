import java.sql.*;
import java.util.Scanner;

public class ForgotPassword {
	static final String D_URL="jdbc:mysql://localhost:3306/student";
	static final String USER="root";
	static final String password="pass@word1";
	static final String pass="TweetApp# 22";
	public void forgotPassword(String emailId) {
	
		try(Connection con= DriverManager.getConnection(D_URL, USER, password);
				Statement stmt=con.createStatement();){
			PreparedStatement ps=con.prepareStatement("UPDATE user SET password=? WHERE email=?");
			ps.setString(1, pass);
			ps.setString(2, emailId);
			int result=ps.executeUpdate();
			if(result==1)
			  System.out.println("Default Password=" + pass);
			else
				System.out.println("Incorrect user details");
		}catch(SQLException e) {
		
		}
	}
	
}
