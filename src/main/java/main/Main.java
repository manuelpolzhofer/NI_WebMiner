package main;

import java.util.HashMap;

import crawler.NICrawler;
import crawler.Website;
import crawler.WebsiteWriter;

public class Main {
	
	public static void main(String []args)
	{
    	System.out.println("NI WebCrawler");
    	NICrawler niCrawler = new NICrawler();
    	String startUrl = "http://en.wikipedia.org/wiki/Data_mining";
    	//String startUrl = "http://derstandard.at";
    	int maxNumberOfVisit = 5;
    	niCrawler.startCrawling(startUrl,maxNumberOfVisit);
    	
    	HashMap<String,Website> visitedWebsites = niCrawler.getVisitedWebsites();
 
    	WebsiteWriter websiteWriter = new WebsiteWriter("korpus");
    	websiteWriter.writeWebsites(visitedWebsites);
    	
    
    	
	}

}
