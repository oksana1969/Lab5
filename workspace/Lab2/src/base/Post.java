package base;

import java.util.Date;

public class Post {
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
		
		  /*if (this.getContent().equals((Post) o).getContent() {
		        return true;
		    }*/
		 
		 
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


		
	
}
	
	
		
	
	




