import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResetPassword {
	static final String D_URL="jdbc:mysql://localhost:3306/student";
	static final String USER="root";
	static final String password="pass@word1";
	
	public void reset(String email,String pass) {
		//Scanner sc=new Scanner(System.in);
		
		
		try(Connection con= DriverManager.getConnection(D_URL, USER, password);
				Statement stmt=con.createStatement();){
			//String query="UPDATE user SET password='TweetApp#22' WHERE email=" + email;
			PreparedStatement ps=con.prepareStatement("UPDATE user SET password=? WHERE email=?");
			ps.setString(1, pass);
			ps.setString(2, email);
			int result=ps.executeUpdate();
			if (result==1)
			    System.out.println("Password changed successfully" );
			else
				System.out.println("User not found");
		}catch(SQLException e) {
			
		}
	}
	
	public void currentUser(boolean currentUserStatus,String email) {
		
		
		try(Connection con= DriverManager.getConnection(D_URL, USER, password);
				Statement stmt=con.createStatement();){
			//String query="UPDATE user SET password='TweetApp#22' WHERE email=" + email;
			PreparedStatement ps=con.prepareStatement("UPDATE user SET currentUserStatus=? WHERE email=?");
			ps.setBoolean(1, currentUserStatus);
			ps.setString(2, email);
			int result=ps.executeUpdate();
//			if (result==1)
//			    System.out.println("Password changed successfully" );
//			else
//				System.out.println("User not found");
		}catch(SQLException e) {
			
		}
	}

}
