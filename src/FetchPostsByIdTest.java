

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class FetchPostsByIdTest {

	  static FetchPostsById fetch= new FetchPostsById();
	  static final String D_URL="jdbc:mysql://localhost:3306/student";
	  static  final String USER="root";
	  static final String password="pass@word1";
	  static final String Query= "select * from user where email= ? ;";
	  @BeforeAll
	  static void init() {
		
		  try ( Connection con=DriverManager.getConnection(D_URL, USER, password);){
	           Statement stmt=con.createStatement();
				PreparedStatement ps=con.prepareStatement(Query);
	          con.setAutoCommit(false);
	      } catch (SQLException e) {
	          e.printStackTrace();
	      }
	    
	  }
	   
	  @AfterAll
	  static void teardown() {
		
	      try(Connection con=DriverManager.getConnection(D_URL, USER, password);) {
	          con.setAutoCommit(true);
	      } catch (SQLException e) {
	          e.printStackTrace();
	      }
	  }
	
	
	@Test
	void test() {
      Registration user=new Registration();
      user.setEmail("kavya@gmail.com");
      user.setFirst_name("Kavya");
      user.setPassword("Kavya@22");
      user.setPost("Selfie-time");
      Registration result=fetch.getByPostId(user.getEmail());
      Assert.assertEquals("name must be matched","Kavya",user.getFirst_name());
     
		
	}

}
