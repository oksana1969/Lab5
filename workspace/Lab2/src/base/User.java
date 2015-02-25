package base;

public class User {
	private int userId;
	private String userName;
	private String userEmail;
	
	public User(int userId, String userName, String userEmail){
		
		this.userId=userId;
		this.userEmail=userEmail;
		this.userName=userName;
	}
	
public String toString(){
		
		
		String s="User [" + userId+  ","+ userName+ "," + userEmail+ "]";

		
		return s;

	}
	
	
}
