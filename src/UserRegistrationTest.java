import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	  static UserRegistration register= new UserRegistration();
	  static final String Query= "select * from user where email= ? ;";
	@Test
	public void test() {
		 Registration user= new Registration();
		 user.setEmail("amulya@gmail.com");
		 user.setFirst_name("amulya");
		 user.setPassword("Amulya@22");
		 user.setPost("you are your choices");
		 register.register(user);
		 Registration result=register.getUserByUsername("amulya");
		 Assert.assertEquals(user.getFirst_name(),result.getFirst_name());
		
	}

}
