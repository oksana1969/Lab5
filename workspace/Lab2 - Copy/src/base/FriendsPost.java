package base;

import java.util.Date;

public class FriendsPost extends Post{
	
	private User friend;
	
	
	public FriendsPost(Date date, String content, User friend){
		super(date,content);
		
		this.friend=friend;
	}
	
public boolean contains(String string) {
		
		boolean check=false;
		
		if(super.contains(string))
		{
			check=true;
		}
		
		
		return check;
		
		
	}
	
	
	public String toString(){
		
		
		String s=friend.toString()+ '\n'+ super.toString();

		
		return s;

	}

		

}
