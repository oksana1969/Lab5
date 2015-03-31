package blog;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import base.*;

import java.io.*;

public class Blog implements Serializable{
	
	private User user;
	private Post post;
	private ArrayList<Post> allPosts;
	private Blog Blog;
	
	/**
	 * @param user
	 */
	public Blog(User user) {
		super();
		this.user = user;
		this.allPosts = new ArrayList<Post>();
	}

	
	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	/**
	 * @param post
	 */
	public Blog(Post post) {
		super();
		this.post = post;
	}

	public ArrayList<Post> getPost() {
		return allPosts;
	}




	/**
	 * generate a new post in your blog
	 * @param post
	 */
	
	public void post(Post p){
		
		allPosts.add(p);
		
		System.out.println("A new post: " + "\n" + p);
	}
	
	/**
	 * list all posts in the blog
	 */
	
	public void list(){
		for (int i=0; i < allPosts.size(); i++){
		
			//allPosts.toString();
			System.out.println(allPosts.get(i));
		
		}
		
		return;
	}
	
	/**
	 * delete a post from the blog
	 * @param index
	 */
	public void delete(int index){
		if(index < allPosts.size() || index > 0){
			allPosts.remove(index);
			System.out.println("Post "+ index+ " has been deleted.");
		}
	
		else{
			System.out.println("Sorry, the post could not be deleted.");
		}
	}
	
	public String toString(){
		
		
		String s = allPosts.toString();

		
		return s;

	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Blog other = (Blog) obj;
		if (allPosts == null) {
			if (other.allPosts != null)
				return false;
		} else if (!allPosts.equals(other.allPosts))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((allPosts == null) ? 0 : allPosts.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}
	
	/**
	 * Search posts created in month and mentioned someone
	 * 
	 * @param month
	 * @param someone
	 */
	public void search(int month, String someone){
		Calendar cal = Calendar.getInstance();
		//search from all posts
		for (Post p : allPosts){
			//get the current post's month (note that Calendar.Month starts
			//with 0, not1)
			cal.setTime(p.getDate());
			int postMonth = cal.get(Calendar.MONTH);
			//TO DO
		}
	}
	
	public void save(String filepath)
	{
		
		try {
			FileOutputStream fs = new FileOutputStream(filepath);
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(this);
			os.close();
			} 
		catch(Exception ex) {
			ex.printStackTrace();
			}
	}
	public void load (String filepath)
	{
		try {
		FileInputStream fs = new FileInputStream(filepath);
		ObjectInputStream is = new ObjectInputStream(fs);
		Blog tmp = (Blog) is.readObject();
		this.setPost(tmp.getPost());
		this.setUser(tmp.getUser());
		is.close();
		} 
		catch(ClassNotFoundException | IOException e) {
			System.out.println("Wait! There is something wrong. I cannot find the file.");
			}
	}


	public void setPost(ArrayList<Post> allposts2) {
		this.allPosts = allposts2;
		// TODO Auto-generated method stub
		
	}

}
