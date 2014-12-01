package main;

import java.util.ArrayList;
import java.util.HashMap;

import pagerank.PageRank;
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
    	int maxNumberOfVisit = 100;
    	niCrawler.startCrawling(startUrl,maxNumberOfVisit);
    	
    	HashMap<String,Website> visitedWebsites = niCrawler.getVisitedWebsites();
 
    	WebsiteWriter websiteWriter = new WebsiteWriter("korpus");
    	websiteWriter.writeWebsites(visitedWebsites);
    	
    	ArrayList<Website> websites =
    		    new ArrayList<Website>(visitedWebsites.values());
    	
    	PageRank pageRanke = new PageRank(websites);
    	pageRanke.calculatePagranks();
    	
    	
    
    	
	}

}
