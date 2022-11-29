
import org.junit.Assert;
import org.junit.Test;

public class ForgotPasswordTest {
	 static ForgotPassword forgotPassword= new ForgotPassword();
	 static UserRegistration register= new UserRegistration();
	  static final String Query= "select * from user where email= ? ;";
	@Test
	public void test() {
		 Registration user= new Registration();
		 user.setEmail("ram@gmail.com");
		 user.setFirst_name("ram");
		  user.setPassword("TweetApp# 22");
		 user.setPost("Stay Salty");
		 register.register(user);
		// user.setPassword("TweetApp#2");
		 forgotPassword.forgotPassword(user.getEmail());
		 Registration result= register.getUserByUsername("ram");
		 Assert.assertEquals("Password should be updated","TweetApp# 22",user.getPassword());
		
	}

}
