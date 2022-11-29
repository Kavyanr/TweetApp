import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class LoginUserTest {

	  static LoginUser fetch= new LoginUser();
	  static UserRegistration register=new UserRegistration();
	
	@Test
	void test() {
      Registration user=new Registration();
      user.setEmail("kavya@gmail.com");
      user.setFirst_name("Kavya");
      user.setPassword("Kavya@22");
      user.setPost("Selfie-time");
     Registration result= register.register(user);
      Assert.assertEquals("Email Id must be matched","kavya@gmail.com",result.getEmail());
     
		
	}

}
