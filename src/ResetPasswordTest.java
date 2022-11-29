import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ResetPasswordTest {

	 static ResetPassword resetPassword= new ResetPassword();
	 static UserRegistration register= new UserRegistration();
	@Test
	public void test() {
		 Registration user= new Registration();
		 user.setEmail("ram@gmail.com");
		 user.setFirst_name("ram");
		 user.setPassword("Ram@2022");
		 user.setPost("Stay Salty");
		 register.register(user);
		 resetPassword.reset(user.getEmail(),user.getPassword());
		 Registration result= register.getUserByUsername("ram");
		 Assert.assertEquals("Password should be updated","Ram@2022",user.getPassword());
		
	}

	

}
