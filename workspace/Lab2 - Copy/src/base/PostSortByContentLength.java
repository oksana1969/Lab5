package base;

import java.util.Comparator;

public class PostSortByContentLength implements Comparator<Post>{
	@Override
	public int compare(Post p1, Post p2){
		int result = 0;
		
	if(p1.getContent().length() > p2.getContent().length()){
		result = 1;
	}
	
	else if(p1.getContent().length() < p2.getContent().length()){
		result = -1;
	}
		
	else if(p1.getContent().length() == p2.getContent().length()){
		result = -1;
	}
	return result;

}
}
