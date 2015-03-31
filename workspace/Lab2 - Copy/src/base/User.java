package base;

public class User implements Comparable<User>{
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
@Override
public int compareTo(User u){
	int result = 0;
	if (userId > u.userId){
		result= 1;
	}
	else if (userId < u.userId){
		result= -1;
	}
	else if(userId == u.userId){
		return result;
	}
	return result;
	
}

	
	
}
