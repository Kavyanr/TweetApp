import java.util.Scanner;

public class TwitterApp {
    static ResetPassword resetPassword=new ResetPassword();
	static Registration registration=new Registration();
	static LoginUser login = new LoginUser();
	static UserRegistration register = new UserRegistration();
	static ForgotPassword reset=new ForgotPassword();
	static Retrieve fetchUsers = new Retrieve();
	static PostTweet tweet=new PostTweet();
	static ViewPosts view=new ViewPosts();
	static FetchPostsById fetchPosts=new FetchPostsById();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int ch,input;
		    boolean flag=true;
      do {
    	  System.out.println("Press 1 for guest user");
    	  System.out.println("Press 2 for registered user");
    	  System.out.println("Enter your choice : ");
    	  ch=sc.nextInt() ;   	  
    	  switch(ch) {
    	  	case 1:
    	  	 System.out.println(" 1.Register \t" + " 2.Login  \t" + " 3.ForgotPassword ");
    	  	 System.out.println("Enter your choice: ");
    	  	 input = sc.nextInt();
    	  	 		switch(input)
    	  	 		{ 
    	  	 		  case 1: 
    	  	 			System.out.println("Enter your email : ");
    					String email = sc.next();
    					System.out.println("Enter first name : ");
    					String fname=sc.next();
    					System.out.println("Enter password : ");
    					String password=sc.next();
    					System.out.println("Enter new tweet : ");
    					String post=sc.next();
    					Registration data=new Registration(email,fname,password,post,false);
    	  	 		      register.register(data);
    	    		      break;
    	  	 		  case 2:
    	  	 			Registration loginData=new Registration();
    	  				System.out.println("Enter your email : ");
    	  				String loginEmail = sc.next();
    	  				System.out.println("Enter password : ");
    	  				String pass=sc.next();
    	  				loginData.setEmail(loginEmail);loginData.setPassword(pass);
    	  	 			  login.login(loginData);
    	  	 			  break;
    	  	 		  case 3:
    	  	 			System.out.println("Enter your email address: ");
    	  	 			String emailId=sc.next();
    	  	 			  reset.forgotPassword(emailId);
    	  	 			  break;
    		   
    		        }break;
    		 
    	  case 2:
    		  System.out.println("1. Post a tweet \t " + " 2. View my tweets \t " + " 3. View all tweets \t" + " 4. View all users \t" + " 5. Reset password \t" + "6. Logout");
    		 System.out.println("Enter your choice: ");
    		  int choice = sc.nextInt();
    		  
    		       switch(choice) {
    		       case 1:
    		    	 
    		    	   tweet.addTweet();
    		    	   break;
    		       case 2:
    				   System.out.println("Enter email address: ");
    				   String emailId=sc.next();
    		    	    fetchPosts.getByPostId(emailId);
    		    	    break;
    		       case 3:
    		    	   view.fetchAllPosts();
    		    	   break;
    		       case 4:
    		    	   fetchUsers.viewAllUsers();
    		    	   break;
    		       case 5:
    		    	   System.out.println("Enter your email address: ");
    					String email=sc.next();
    					System.out.println("Enter your new password: ");
    					String pass=sc.next();
    		    	   resetPassword.reset(email,pass);
    		    	   break;
    		       case 6:
    		    	   System.out.println("Enter email:");
    		    	   String emailAddress=sc.next();
    		    	   login.logOut(emailAddress);
    		    	  // break;
    		       }
    		  default:
    		        System.out.println("Twitter Application");
    	  }
    	 System.out.println("Do you want to continue (yes/no) ");
    	 String str=sc.next();
    	 if((str.equals("yes")) || (str.equals("y")))
    		 flag=true;
    	 if((str.equals("no")) || (str.equals("n")))
    	     flag=false;
    	 
      }while(flag);

	}

}
