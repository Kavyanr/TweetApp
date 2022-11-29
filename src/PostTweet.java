import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PostTweet {

	static final String D_URL="jdbc:mysql://localhost:3306/student";
	static final String USER="root";
	static final String password="pass@word1";
	//static final String Query= "UPDATE user SET  post=?  WHERE email=?";
	
	public void addTweet() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email: ");
		String email = sc.next();
		System.out.println("Post a new tweet: ");
		String post=sc.next();
		try(Connection con=DriverManager.getConnection(D_URL, USER, password);
				Statement stmt=con.createStatement();)
				
				{
			PreparedStatement ps=con.prepareStatement("UPDATE user SET  post= ? WHERE email=?");
		
		ps.setString(1, post );
		ps.setString(2, email);
		int result = ps.executeUpdate();

		System.out.println("New Post updated");
			if(result==1)
				System.out.println("Post uploaded successfully");
			else 
				System.out.println("Unable to upload");
			
		}catch(SQLException e) {
			
		}
	}
}