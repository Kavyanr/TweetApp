import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginUser {
	
	static Registration register = new Registration();
	static ResetPassword userData=new ResetPassword();
	static final String D_URL="jdbc:mysql://localhost:3306/student";
	static final String USER="root";
	static final String password="pass@word1";
	static final String Query= "select * from user where email=? AND password=? ;";
	
	public void login(Registration user) {
		try(Connection con=DriverManager.getConnection(D_URL, USER, password);
				Statement stmt=con.createStatement();
				PreparedStatement ps=con.prepareStatement(Query);
				){
			
			
			ps.setString(1, user.getEmail());
			ps.setString(2, user.getPassword());
			user.setCurrentUserStatus(true);
			userData.currentUser(true, user.getEmail());
			ResultSet result =ps.executeQuery();	
			if(result.next()) {
			//	System.out.println(user.getCurrentUserStatus());
				System.out.println("Login success");
			}else
				System.out.println("User not found");
			
		}catch(SQLException e) {
			System.out.println(e);}

}

	public void logOut(String email) {
		Registration data=new Registration();
		data.setEmail(email);
	    data.setCurrentUserStatus(false);
	    userData.currentUser(false, data.getEmail());
		System.exit(0);
		}
}