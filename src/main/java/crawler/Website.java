package crawler;

import java.util.ArrayList;

public class Website {
	
	String url;
	ArrayList<String> links;
	
	public Website(String url,ArrayList<String> links)
	{
		this.url = url;
		this.links = links;
		
	}
	
	public String getUrl()
	{
		return this.url;
	}
	
	
	public ArrayList<String> getLinks()
	{
		return this.links;
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
