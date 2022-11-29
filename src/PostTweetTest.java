import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PostTweetTest {
	
	 static PostTweet addTweet= new PostTweet();
	 static UserRegistration register= new UserRegistration();
	 
	@Test
	public void test() {
		 Registration user= new Registration();
		 user.setEmail("ram@gmail.com");
		 user.setPost("I decide my vibes");
		 register.register(user);
		 addTweet.addTweet();
	//	 Registration result= register.getUserByUsername("ram");
		 Assert.assertEquals("New post should be added","I decide my vibes",user.getPost());
		
	}

}
