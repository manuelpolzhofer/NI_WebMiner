package crawler;

import java.util.ArrayList;

public class Website {
	
	String url;
	ArrayList<String> links;
	String text;
	String title;
	
	public Website(String url,String text, String title, ArrayList<String> links)
	{
		this.url = url;
		this.links = links;
		this.text = text;
		this.title = title;
		
	}
	
	public String getUrl()
	{
		return this.url;
	}
	
	
	public String getTitle()
	{
		return this.title;
	}
	
	
	public ArrayList<String> getLinks()
	{
		return this.links;
	}
	
	public String getText()
	{
		return this.text;
	}
	
	public String toString()
	{
		String string = "url: "+this.url+"\n";
		for(int i = 0;i<links.size();i++)
		{
			string = string+"Link:"+links.get(i)+"\n";
		}
		return string;
		
		
	}

}
