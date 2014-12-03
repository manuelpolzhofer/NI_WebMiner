package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import pagerank.PageRank;
import textminer.Document;
import textminer.Preprocesser;
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
    	
    	ArrayList<Website> websites =
    		    new ArrayList<Website>(visitedWebsites.values());
    	
    	PageRank pageRanke = new PageRank(websites);
    	pageRanke.calculatePagranks();
    	
    	
		ArrayList<Document> docList;
		
		
		String stopwords = "../stopwords.txt";
		
		
		
		File folderFile = new File("korpus");
		File[] fileList = folderFile.listFiles();
		
		// Preprocessing
		File dir = null;
		try {
			dir = Preprocesser.applyStemmer((Preprocesser.removeStopWords(fileList, stopwords)).listFiles());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//String query = new String("")
		
		//Generate TF-IDF vector representation
		Document d = new Document(null,null);		
		docList = d.processAllDocuments(dir);
		
		
		
		
		
    	
    
    	
	}

}
