import java.sql.*;
public class Registration {
    

	private String email;
	private String first_name;
	private String password;
	private String post;
	private Boolean currentUserStatus;
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public Boolean getCurrentUserStatus() {
		return currentUserStatus;
	}
	public void setCurrentUserStatus(Boolean currentUserStatus) {
		this.currentUserStatus = currentUserStatus;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(String email, String first_name, String password, String post, Boolean currentUserStatus) {
		super();
		this.email = email;
		this.first_name = first_name;
		this.password = password;
		this.post = post;
		this.currentUserStatus = currentUserStatus;
	}
	@Override
	public String toString() {
		return "Registration [email=" + email + ", first_name=" + first_name + ", password=" + password + ", post="
				+ post + ", currentUserStatus=" + currentUserStatus + "]";
	}
	public Registration(String email, String post) {
		super();
		this.email = email;
		this.post = post;
	}
	
	
}
