package test;
import java.io.*;
import java.util.Date;

import base.*;
import blog.*;


public class TestBlog {
	
	public String getInput(){
		String line="";
		System.out.print("Enter the prompt: ");
		try{
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			line = br.readLine();
		}
		catch(IOException e){
		e.printStackTrace();	
		}
		return line;
	}
	
	public static void main(String[] args){
		
		TestBlog testBlog = new TestBlog();
		User user = new User(1, "COMP3021","COMP3021@cse.ust.hk");
		Blog myblog = new Blog(user);
		String prompt = null;
		Date date = new Date();
		String content;
		
		while(!(prompt = testBlog.getInput()).equals("exit")){
			if(prompt.startsWith("list")){
				myblog.list();
			}
			else if(prompt.startsWith("post")){
				//how to get content from the prompt?
				//String phrase = "the music made   it   hard      to        concentrate";
				//String delims = "[ ]+";
				//String[] tokens = phrase.split(delims);
				//for (int i = 0; i < tokens.length; i++)
			    //System.out.println(tokens[i]);
				//String inputStr = prompt;
				//String delims = "[ ]+";
				//String[] tokens = inputStr.split(delims);
				
				//for (int i=1; i<tokens.length; i++){
					// String contentStr = tokens.toString();
					// content = contentStr;
				//}
				content = prompt;
				Post post = new Post(date, content);
				myblog.post(post);
			}
			else if (prompt.startsWith("delete")){
				int index=prompt.charAt(7);
				index=1;
				String s = prompt.substring(7); 
				index = Integer.parseInt(s);
				myblog.delete(index);
			}
		}
		
	}

}
