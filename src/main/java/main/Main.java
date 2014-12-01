package main;

import crawler.NICrawler;

public class Main {
	
	public static void main(String []args)
	{
    	System.out.println("NI WebCrawler");
    	NICrawler niCrawler = new NICrawler();
    	String startUrl = "de.wikipedia.org/wiki/Wien";
    	int maxNumberOfVisit = 100;
    	boolean start = true;
    	if(args.length == 2)
    	{
    	if(args[0] != null)
    	{
    		startUrl = args[0];
    	}
    	if(args[1] != null)
    	{
    		maxNumberOfVisit = Integer.parseInt(args[1]);
    	}
    	}
    	else
    	{
    		start=false;
    		System.out.println("Please add Parameter <url> <maxNumberOfVisits>");
    	}
    	
    	if(startUrl.contains("http://") == false)
    	{
    	startUrl = "http://"+startUrl;
    	
    	}
    	if(start)
    	{
    	niCrawler.startCrawling(startUrl,maxNumberOfVisit);
    	}
    	
    
    	
	}

}
