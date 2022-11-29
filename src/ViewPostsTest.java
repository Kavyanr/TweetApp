import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ViewPostsTest {

	 static ViewPosts fetchAllPosts= new ViewPosts();
	 static UserRegistration register= new UserRegistration();
	@Test
	public void test() {
		 Registration user1= new Registration();
		 user1.setEmail("ram@gmail.com");
		 user1.setFirst_name("ram");
		 user1.setPassword("ram@22");
		 user1.setPost("Stay Salty");
		 register.register(user1);
		 Registration user2= new Registration();
		 user2.setEmail("amar@gmail.com");
		 user2.setFirst_name("amar");
		 user2.setPassword("amar@22");
		 user2.setPost("Stay happy");
		 register.register(user2);
		List list1=new ArrayList<>();
		list1.add(user1);
		list1.add(user2);
		int size=list1.size();
	  fetchAllPosts.fetchAllPosts();
       Assert.assertEquals(2, size);
		
		
		
}
}