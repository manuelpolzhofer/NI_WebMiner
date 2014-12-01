package crawler;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;*/
import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebsiteParser {
	
	
	//private static final String USER_AGENT = null;

	public WebsiteParser()
	{
		
	}
	
	
	/*
	 * TODO: byHandMethod 
	 * 
	 * private String sendGetRequest(String url) throws IOException {
		 
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
		// optional default is GET
		con.setRequestMethod("GET");
 
		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
 
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
 
		//print result
		return response.toString();
	}*/
	
	  public  ArrayList<String>extractLinks(String url) throws IOException {
		    final ArrayList<String> result = new ArrayList<String>();
		    Document doc = Jsoup.connect(url).get();
		    Elements links = doc.select("a[href]");
		    for (Element link : links) {
		      result.add(link.attr("abs:href"));
		    }
		    return result;
		  }
	
	
	
	public Website parseWebsite(String url)
	{
		ArrayList<String> links = null;
		try {
			links = this.extractLinks(url);
		} catch (Exception e) {
			
			return null; //broken url
		}

		return new Website(url,links);
		
	}
	
	

}
