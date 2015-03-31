package base;

import java.util.Date;

public class Post implements Comparable<Post>{
	private Date date;
	private String content;
	
	
	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	
	public Post(Date date, String content) {
		this.date=date;
		this.content=content;
	}
	
	
	
	public String toString(){
		
		String s=date.toString() + '\n' + content;

		return s;

	}
	
	
	public boolean equals (Object o) {
		
		boolean check = true;
		
		 if (o == null) {
		        check= false;
		    }
		
		 if (getClass() != o.getClass()) {
		       check=false;
		    }
		
		
		
		 if ((this.getContent() == null) && (((Post) o).getContent() == null)){
		        check=true;
		    }
		
		  	 
		 
		return check;
		
	}


	public int hashCode() {
		
		int hash=3;
		
		hash = 53 * hash + (this.getDate() != null ? this.getDate().hashCode() : 0);
	    hash = 53 * hash + (this.getContent() != null ? this.getDate().hashCode() : 0);
		
		return hash;

		
		
	}

	public boolean contains(String s){
		
		boolean check=false;
		if (content.contains(s))
		{
			check=true;
		}
		
		return check;
		
	}



	@Override
	public int compareTo(Post p) {
		int result = 0 ;
		if (date.before(p.date) ){
			result = 1;
		}
		else if (date.after(p.date)){
			result = -1;
		}
		else if (date == p.date){
			return result;
		}
		return result;
	}

}
